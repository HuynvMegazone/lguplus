package com.lguplus.fleta.ports.service;

import com.lguplus.fleta.domain.dto.UserInfo;

public interface UserService {
    UserInfo findUsername(String username);
}
