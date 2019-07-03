package com.qp.dao;

import com.qp.pojo.CarExternalInfo;

public interface CarExternalInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarExternalInfo record);

    int insertSelective(CarExternalInfo record);

    CarExternalInfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(CarExternalInfo record);

    int updateByPrimaryKey(CarExternalInfo record);
}