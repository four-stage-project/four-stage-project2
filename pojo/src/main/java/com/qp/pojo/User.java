package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    private String uid;

    /**
    * 用户名  用户的唯一标识
    */
    private String username;

    /**
    * 用户的登录密码
    */
    private String upassword;

    /**
    * 用户的真实姓名
    */
    private String uname;

    /**
    * 用户年龄，选填
    */
    private Integer uage;

    /**
    * 用户性别，选填
    */
    private String usex;

    /**
    * 用户电子邮箱，必填，验证
    */
    private String uemail;

    /**
    * 用户联系方式，必填，与买家（卖家）交流的渠道
    */
    private String uphone;

    /**
    * 注册（指填写完信息）的时间
    */
    private Date uregistertime;

    /**
    * 激活状态
    */
    private Byte ustatus;

    /**
    * 激活码
    */
    private String uvalidatecode;

    private static final long serialVersionUID = 1L;
}