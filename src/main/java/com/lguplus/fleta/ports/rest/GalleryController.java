package com.lguplus.fleta.ports.rest;

import com.lguplus.fleta.config.dto.GalleryInfo;
import com.lguplus.fleta.ports.service.GalleryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "GalleryController")
@RestController
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    @RequestMapping(method = RequestMethod.GET, value = "/gallery/catelist")
    public ResponseEntity<List> getGalleryCateList(@Param("galleryid") String galleryid) {
        List<GalleryInfo> ls = galleryService.getGalleryCateList(galleryid);
        System.out.println("Find gallery = " + ls.size());
        if (ls != null) {
            return new ResponseEntity<>(ls, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
