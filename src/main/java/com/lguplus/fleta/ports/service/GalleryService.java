package com.lguplus.fleta.ports.service;

import com.lguplus.fleta.config.dto.GalleryInfo;

import java.util.List;

public interface GalleryService {
    List<GalleryInfo> getGalleryCateList(String galleryid);

    GalleryInfo getGalleryById(String galleryid);
}
