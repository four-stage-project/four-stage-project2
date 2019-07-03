package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class Pic implements Serializable {
    /**
     * 图片id
     */
    private String picId;

    /**
     * 汽车id
     */
    private String carId;

    /**
     * 图片链接
     */
    private String picUrl;

    private static final long serialVersionUID = 1L;
}