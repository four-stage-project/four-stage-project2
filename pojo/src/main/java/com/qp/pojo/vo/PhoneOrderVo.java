package com.qp.pojo.vo;

import com.qp.pojo.CarOrder;

public class PhoneOrderVo {
    private String phone;
    private CarOrder carOrder;

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "PhoneOrderVo{" +
                "phone='" + phone + '\'' +
                ", order=" + carOrder +
                '}';
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CarOrder getOrder() {
        return carOrder;
    }

    public void setOrder(CarOrder order) {
        this.carOrder = order;
    }
}
