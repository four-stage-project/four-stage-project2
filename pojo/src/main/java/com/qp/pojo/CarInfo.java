package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarInfo implements Serializable {
    /**
    * 汽车编号
    */
    private String carId;

    /**
    * 品牌
    */
    private String brand;

    private String carName;

    /**
    * 基本配置（出场年份，排量，款式）
    */
    private String confName;

    /**
    * 级别
    */
    private String level;

    /**
    * 发动机基本信息
    */
    private String engine;

    /**
    * 变速箱基本信息
    */
    private String gearbox;

    /**
    * 车身结构
    */
    private String bodyStructure;

    /**
    * 汽车尺寸
    */
    private String size;

    /**
    * 最大车速
    */
    private String maximumspeed;

    /**
    * 行李箱容积
    */
    private String cargoVolume;

    /**
    * 车龄
    */
    private Double carAge;

    /**
    * 行驶里程
    */
    private Double carMileage;

    /**
    * 车辆损耗程度（越低越接近新车）
    */
    private String carDamage;

    /**
    * 是否急于出售
    */
    private String iseager;

    private Double price;

    /**
    * 牌照归属地
    */
    private String licenseAddress;

    /**
    * 详细验车地址
    */
    private String address;

    /**
    * 是否已被人预约
    */
    private String islocked;

    private String uid;

    private static final long serialVersionUID = 1L;
}