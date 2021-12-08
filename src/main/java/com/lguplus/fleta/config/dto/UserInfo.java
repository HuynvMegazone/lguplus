package com.lguplus.fleta.config.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {
    private String username;
    private String password;
    private String description;
}
