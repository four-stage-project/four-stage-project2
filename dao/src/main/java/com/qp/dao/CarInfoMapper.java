package com.qp.dao;

import com.qp.pojo.CarInfo;

public interface CarInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}