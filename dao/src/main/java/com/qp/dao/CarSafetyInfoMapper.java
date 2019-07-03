package com.qp.dao;

import com.qp.pojo.CarSafetyInfo;
import com.qp.pojo.CarSafetyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarSafetyInfoMapper {
    long countByExample(CarSafetyInfoExample example);

    int deleteByExample(CarSafetyInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarSafetyInfo record);

    int insertSelective(CarSafetyInfo record);

    List<CarSafetyInfo> selectByExample(CarSafetyInfoExample example);

    CarSafetyInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarSafetyInfo record, @Param("example") CarSafetyInfoExample example);

    int updateByExample(@Param("record") CarSafetyInfo record, @Param("example") CarSafetyInfoExample example);

    int updateByPrimaryKeySelective(CarSafetyInfo record);

    int updateByPrimaryKey(CarSafetyInfo record);
}