//package com.lguplus.fleta.adapters.repositoryimpl;
//
//import com.lguplus.fleta.adapters.repositoryimpl.Key.CacheKey;
//import com.lguplus.fleta.adapters.repositoryimpl.Key.QueryKey;
//import com.lguplus.fleta.config.dto.UserInfo;
//import com.lguplus.fleta.ports.repository.UserInfoRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//
//
//@Repository("userInfoPostgresRepositoryImpl")
//public interface UserInfoPostgresRepositoryImpl extends UserInfoRepository {
//
////    private static final String NAME_SPACE = "com.lguplus.fleta.adapters.repositoryimpl.UserInfoPostgresRepositoryImpl";
////
////    private final EntityManager entityManager;
////
////    public UserInfoPostgresRepositoryImpl(EntityManager entityManager) {
////        this.entityManager = entityManager;
////    }
////
////    @Cacheable(key = "{#username}")
////    @Override
////    public UserInfo findUser(String username) {
////        String queryStr = "select id,name from users where roll_no = ?1";
////        try {
////            long startTime = System.currentTimeMillis();
////
////            String queryString = "select username,password, description from tbl_user where username = 'admin' ";
////            log.info(">>> SQL: {}", queryString);
////            UserInfo userInfo =  (UserInfo) entityManager.createNativeQuery(queryString, "UserInfoResult").getSingleResult();
////
////            log.info(">>> Executed Time: {}", (System.currentTimeMillis() - startTime));
////            return userInfo;
////        } catch (Exception ex) {
////            log.error(ex.getMessage(), ex);
////        }
////        return null;
////    }
//
//        @Query(name = QueryKey.FIND_USERNAME_ALBUM_KEY,
//                nativeQuery = true)
//        @Cacheable(value = CacheKey.AB_CATEGORY_KEY, key = "#username")
//        @Override
//        UserInfo findUsername(@Param("username") String username);
//}
