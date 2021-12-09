package com.lguplus.fleta.domain.service.impl;

import com.lguplus.fleta.config.dto.GalleryInfo;
import com.lguplus.fleta.ports.repository.GalleryRepository;
import com.lguplus.fleta.ports.service.GalleryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalleryServiceImpl implements GalleryService {

    private final GalleryRepository galleryRepository;

    public GalleryServiceImpl(@Qualifier("galleryOracleRepository") GalleryRepository galleryRepository){
        this.galleryRepository = galleryRepository;
    }

    @Override
    public List<GalleryInfo> getGalleryCateList(String galleryid) {
        List<GalleryInfo> ls = galleryRepository.getGalleryCateList(galleryid);
        return ls;
    }

    @Override
    public GalleryInfo getGalleryById(String galleryid) {
        GalleryInfo g = galleryRepository.getGalleryById(galleryid);
        return g;
    }
}
