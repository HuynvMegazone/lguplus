package com.lguplus.fleta.adapters.repositoryimpl;

import com.lguplus.fleta.adapters.repositoryimpl.Key.CacheKey;
import com.lguplus.fleta.adapters.repositoryimpl.Key.QueryKey;
import com.lguplus.fleta.domain.dto.UserInfo;
import com.lguplus.fleta.domain.model.User;
import com.lguplus.fleta.ports.repository.UserInfoRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoPostgresRepository extends UserInfoRepository, CrudRepository<User, String> {
    @Query(name = QueryKey.FIND_USERNAME_ALBUM_KEY,
            nativeQuery = true)
    @Cacheable(value = CacheKey.AB_CATEGORY_KEY, key = "#username")
    @Override
    UserInfo findUsername(@Param("username") String username);
}
