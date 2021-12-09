package com.lguplus.fleta.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Entity
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PT_UX_GALLERY", schema = "SMARTUX")
public class Gallery implements Serializable {
    @Id
    @Column(name = "GALLERY_ID")
    private String galleryId;

    @Column(name = "P_GALLERY_ID")
    private String pGalleryId;

    @Column(name = "GALLERY_NAME")
    private String galleryName;

    @Column(name = "GALLERY_TYPE")
    private String galleryType;

    @Column(name = "REPS_IMAGE")
    private String repsImage;

    @Column(name = "THUMBNAIL")
    private String thumbnail;

    @Column(name = "REG_DT")
    private String regDt;

    @Column(name = "REG_ID")
    private String regId;

    @Column(name = "MOD_DT")
    private String modDT;

    @Column(name = "MOD_ID")
    private String modId;

    @Column(name = "ORD")
    private int ord;

    @Column(name = "USE_YN")
    private String useYn;

    @Column(name = "DELETE_YN")
    private String deleteYn;

}
