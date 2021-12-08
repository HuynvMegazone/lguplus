package com.lguplus.fleta.ports.service;

import com.lguplus.fleta.config.dto.UserInfo;

public interface UserService {
    UserInfo findUsername(String username);
}
