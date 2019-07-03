package com.qp.dao;

import com.qp.pojo.CarSafetyInfo;

public interface CarSafetyInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarSafetyInfo record);

    int insertSelective(CarSafetyInfo record);

    CarSafetyInfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(CarSafetyInfo record);

    int updateByPrimaryKey(CarSafetyInfo record);
}