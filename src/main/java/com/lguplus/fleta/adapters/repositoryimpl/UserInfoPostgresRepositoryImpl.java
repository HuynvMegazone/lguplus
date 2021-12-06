package com.lguplus.fleta.adapters.repositoryimpl;

import com.lguplus.fleta.config.dto.UserInfo;
import com.lguplus.fleta.ports.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Slf4j
@Repository("userInfoPostgresRepositoryImpl")
public class UserInfoPostgresRepositoryImpl implements UserInfoRepository {

    private static final String NAME_SPACE = "com.lguplus.fleta.adapters.repositoryimpl.UserInfoPostgresRepositoryImpl";

    private final EntityManager entityManager;

    public UserInfoPostgresRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Cacheable(key = "{#username}")
    @Override
    public UserInfo findUser(String username) {
        String queryStr = "select id,name from users where roll_no = ?1";
        try {
            long startTime = System.currentTimeMillis();

            String queryString = "select username,password from tbl_user where username = ?1";
            log.info(">>> SQL: {}", queryString);
            UserInfo userInfo =  (UserInfo) entityManager.createNativeQuery(queryString, "UserInfoResult").getSingleResult();

            log.info(">>> Executed Time: {}", (System.currentTimeMillis() - startTime));
            return userInfo;
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return null;
    }
}
