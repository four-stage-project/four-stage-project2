package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarExternalInfo implements Serializable {
    private String carId;

    /**
     * 电动天窗
     */
    private String electronicSunroof;

    /**
     * 全景天窗
     */
    private String panoramicSunroof;

    /**
     * 电动吸合门
     */
    private String electronicDoorPull;

    /**
     * 电动后备箱
     */
    private String electronicTrunk;

    /**
     * 雨量感应雨刷
     */
    private String rainSensingWipers;

    /**
     * 后雨刷
     */
    private String rearWiper;

    /**
     * 前/后电动车窗
     */
    private String powerWindow;

    /**
     * 电动后视镜
     */
    private String electronicRearviewMirror;

    /**
     * 后视镜加热
     */
    private String rearviewMirrorHeating;

    private static final long serialVersionUID = 1L;
}