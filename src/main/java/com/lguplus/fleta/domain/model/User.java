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
@Table(name = "tbl_user", schema = "public")
public class User implements Serializable {
    @Id
    @Column(name = "user_name")
    private String username;
}