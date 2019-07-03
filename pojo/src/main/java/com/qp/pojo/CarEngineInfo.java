package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarEngineInfo implements Serializable {
    private String carId;

    /**
    * 排量（ml） 不为空
    */
    private Double displacement;

    /**
    * 进气形式（不为空）
    */
    private String intakeForm;

    /**
    * 汽缸排列方式（不为空）
    */
    private String cylinderArrangement;

    /**
    * 汽缸数（不为空）
    */
    private String cylinders;

    /**
    * 最大马力
    */
    private String maximumHorsepower;

    /**
    * 燃料类型（不为空）
    */
    private String fuel;

    /**
    * 燃油标号（不为空）
    */
    private String fuelLabel;

    /**
    * 供油方式
    */
    private String oilsupplyMode;

    /**
    * 排放标准（不为空）
    */
    private String enviromentStandard;

    private static final long serialVersionUID = 1L;
}