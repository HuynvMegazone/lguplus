package com.lguplus.fleta.ports.service;

import com.lguplus.fleta.domain.dto.GalleryInfo;
import com.lguplus.fleta.domain.model.Gallery;

import java.util.List;

public interface GalleryService {
    List<GalleryInfo> getGalleryCateList(String galleryid);

    Gallery getGalleryById(String galleryid);
}
