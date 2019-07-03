package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CarOrder implements Serializable {
    /**
    * 订单编号
    */
    private String orderId;

    /**
    * 汽车编号
    */
    private String carId;

    /**
    * 汽车基本信息
    */
    private String baseinfo;

    /**
    * 汽车售价
    */
    private Double carPrice;

    /**
    * 定金
    */
    private Double deposit;

    /**
    * 卖家姓名
    */
    private String sellerId;

    /**
    * 验车地址
    */
    private String address;

    /**
    * 买家id
    */
    private String buyerId;

    /**
    * 订单发布时间
    */
    private Date orderTime;

    private String orderStatus;

    private static final long serialVersionUID = 1L;
}