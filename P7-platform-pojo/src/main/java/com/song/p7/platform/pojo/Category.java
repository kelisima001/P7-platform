package com.song.p7.platform.pojo;

import com.song.p7.platform.base.TimeStampDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Category extends TimeStampDB implements Serializable {
    private Integer id;

    private String name;

    private Integer type;

    private Integer fatherId;

    private String logo;

    private String slogan;

    private String catImage;

    private String bgColor;

    private static final long serialVersionUID = 1L;

}