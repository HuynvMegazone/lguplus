package com.lguplus.fleta.ports.repository;

import com.lguplus.fleta.config.dto.GalleryInfo;

import java.util.List;

public interface GalleryRepository {
    List<GalleryInfo> getGalleryCateList(String galleryid);

    GalleryInfo getGalleryById(String galleryid);
}
