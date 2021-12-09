package com.lguplus.fleta.domain.service.impl;

import com.lguplus.fleta.domain.dto.UserInfo;
import com.lguplus.fleta.ports.repository.UserInfoRepository;
import com.lguplus.fleta.ports.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private final UserInfoRepository userInfoRepository;

    public UserServiceImpl(@Qualifier("userInfoPostgresRepository") UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }

    public UserInfo findUsername(String username) {
        UserInfo  u =  userInfoRepository.findUsername(username);
        System.out.print("RESULT = " + u.getDescription() );
        return u;
    }
}
