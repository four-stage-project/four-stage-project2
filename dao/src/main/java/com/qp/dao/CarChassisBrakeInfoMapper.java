package com.qp.dao;

import com.qp.pojo.CarChassisBrakeInfo;
import com.qp.pojo.CarChassisBrakeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarChassisBrakeInfoMapper {
    long countByExample(CarChassisBrakeInfoExample example);

    int deleteByExample(CarChassisBrakeInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarChassisBrakeInfo record);

    int insertSelective(CarChassisBrakeInfo record);

    List<CarChassisBrakeInfo> selectByExample(CarChassisBrakeInfoExample example);

    CarChassisBrakeInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarChassisBrakeInfo record, @Param("example") CarChassisBrakeInfoExample example);

    int updateByExample(@Param("record") CarChassisBrakeInfo record, @Param("example") CarChassisBrakeInfoExample example);

    int updateByPrimaryKeySelective(CarChassisBrakeInfo record);

    int updateByPrimaryKey(CarChassisBrakeInfo record);
}