package com.lguplus.fleta.domain.service.impl;

import com.lguplus.fleta.config.dto.UserInfo;
import com.lguplus.fleta.ports.repository.UserInfoRepository;
import com.lguplus.fleta.ports.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private final UserInfoRepository userInfoRepository;

    public UserServiceImpl(final UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo findUser(String username) {
        UserInfo  u =  userInfoRepository.findUser("admin");
        return u;
    }
}
