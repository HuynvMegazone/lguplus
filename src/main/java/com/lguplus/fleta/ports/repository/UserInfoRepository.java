package com.lguplus.fleta.ports.repository;

import com.lguplus.fleta.config.dto.UserInfo;

public interface UserInfoRepository {
    UserInfo findUser(String username);
}
