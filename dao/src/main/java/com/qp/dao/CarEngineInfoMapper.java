package com.qp.dao;

import com.qp.pojo.CarEngineInfo;
import com.qp.pojo.CarEngineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarEngineInfoMapper {
    long countByExample(CarEngineInfoExample example);

    int deleteByExample(CarEngineInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarEngineInfo record);

    int insertSelective(CarEngineInfo record);

    List<CarEngineInfo> selectByExample(CarEngineInfoExample example);

    CarEngineInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarEngineInfo record, @Param("example") CarEngineInfoExample example);

    int updateByExample(@Param("record") CarEngineInfo record, @Param("example") CarEngineInfoExample example);

    int updateByPrimaryKeySelective(CarEngineInfo record);

    int updateByPrimaryKey(CarEngineInfo record);
}