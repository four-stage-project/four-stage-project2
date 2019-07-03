package com.qp.dao;

import com.qp.pojo.CarInternalInfo;

public interface CarInternalInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarInternalInfo record);

    int insertSelective(CarInternalInfo record);

    CarInternalInfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(CarInternalInfo record);

    int updateByPrimaryKey(CarInternalInfo record);
}