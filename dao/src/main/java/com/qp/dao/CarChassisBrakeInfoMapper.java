package com.qp.dao;

import com.qp.pojo.CarChassisBrakeInfo;

public interface CarChassisBrakeInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarChassisBrakeInfo record);

    int insertSelective(CarChassisBrakeInfo record);

    CarChassisBrakeInfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(CarChassisBrakeInfo record);

    int updateByPrimaryKey(CarChassisBrakeInfo record);
}