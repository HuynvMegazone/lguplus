package com.lguplus.fleta.config.dto;

import lombok.*;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GalleryInfo {
    private String id;
    private String parent;
    private String text;
    private String type;
    private String useyn;
}
