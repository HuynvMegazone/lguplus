package com.lguplus.fleta.ports.repository;

import com.lguplus.fleta.domain.dto.UserInfo;

public interface UserInfoRepository {
    UserInfo findUsername(String username);
}
