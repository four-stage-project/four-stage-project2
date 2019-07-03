package com.qp.pojo.vo;

import com.qp.pojo.Order;

public class PhoneOrderVo {
    private String phone;
    private Order order;

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "PhoneOrderVo{" +
                "phone='" + phone + '\'' +
                ", order=" + order +
                '}';
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
