package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarChassisBrakeInfo implements Serializable {
    private String carId;

    /**
    * 驱动方式（选填）
    */
    private String driveMode;

    /**
    * 助力类型
    */
    private String autoPowerType;

    /**
    * 前悬挂类型
    */
    private String frontSuspensionType;

    /**
    * 后悬挂类型
    */
    private String rearSuspensionType;

    /**
    * 前制动类型
    */
    private String frontBrakeType;

    /**
    * 后制动类型
    */
    private String rearBrakeType;

    /**
    * 驻车制动类型（选填）
    */
    private String parkingBrakeType;

    /**
    * 前轮胎规格
    */
    private String frontWheelSize;

    /**
    * 后轮胎规格
    */
    private String rearWheelSize;

    private static final long serialVersionUID = 1L;
}