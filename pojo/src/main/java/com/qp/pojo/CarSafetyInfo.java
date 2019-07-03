package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CarSafetyInfo implements Serializable {
    /**
     * 汽车编号
     */
    private String carId;

    /**
     * 主/副驾驶安全气囊
     */
    private String frontAirbag;

    /**
     * 前/后排头部气囊
     */
    private String headAirbag;

    /**
     * 儿童座椅接口
     */
    private String childSeatInt;

    /**
     * 胎压检测
     */
    private String tpms;

    /**
     * 车内中控锁
     */
    private String carLock;

    /**
     * ABS防抱死系统
     */
    private String abs;

    /**
     * 车身稳定控制
     */
    private String usc;

    /**
     * 无钥匙启动
     */
    private String pss;

    private static final long serialVersionUID = 1L;
}