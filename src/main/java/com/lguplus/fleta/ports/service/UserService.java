package com.lguplus.fleta.ports.service;

import com.lguplus.fleta.config.dto.UserInfo;

public interface UserService {
    UserInfo findUser(String username);
}
