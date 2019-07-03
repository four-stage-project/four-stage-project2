package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarInternalInfo implements Serializable {
    private String carId;

    /**
    * 多功能方向盘
    */
    private String mfSteeringWheel;

    /**
    * 定速巡航
    */
    private String dlcc;

    /**
    * 自动空调
    */
    private String automaticAirCon;

    /**
    * 手动空调
    */
    private String manualAirCon;

    /**
    * GPS导航
    */
    private String gps;

    /**
    * 倒车雷达
    */
    private String parkingRedar;

    /**
    * 倒车影像
    */
    private String reverseVideo;

    /**
    * 真皮座椅
    */
    private String leatherSeat;

    /**
    * 前后排座椅加热
    */
    private String seatHeating;

    private static final long serialVersionUID = 1L;
}