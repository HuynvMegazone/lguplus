package com.lguplus.fleta.adapters.repositoryimpl;

import com.lguplus.fleta.adapters.repositoryimpl.Key.CacheKey;
import com.lguplus.fleta.adapters.repositoryimpl.Key.QueryKey;
import com.lguplus.fleta.config.dto.GalleryInfo;
import com.lguplus.fleta.domain.model.Gallery;
import com.lguplus.fleta.ports.repository.GalleryRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GalleryOracleRepository extends GalleryRepository, CrudRepository<Gallery, String> {

    @Query(name = QueryKey.GET_GALLERY_LIST_ALBUM_KEY,
            nativeQuery = true)
    @Cacheable(value = CacheKey.AB_CATEGORY_KEY, key = "#galleryid")
    @Override
    List<GalleryInfo> getGalleryCateList(@Param("galleryid") String galleryid);
}
