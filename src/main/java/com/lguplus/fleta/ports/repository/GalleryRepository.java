package com.lguplus.fleta.ports.repository;

import com.lguplus.fleta.domain.dto.GalleryInfo;
import com.lguplus.fleta.domain.model.Gallery;

import java.util.List;

public interface GalleryRepository {
    List<GalleryInfo> getGalleryCateList(String galleryid);

    Gallery getGalleryById(String galleryid);
}
