package com.qp.dao;

import com.qp.pojo.CarInternalInfo;
import com.qp.pojo.CarInternalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarInternalInfoMapper {
    long countByExample(CarInternalInfoExample example);

    int deleteByExample(CarInternalInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarInternalInfo record);

    int insertSelective(CarInternalInfo record);

    List<CarInternalInfo> selectByExample(CarInternalInfoExample example);

    CarInternalInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarInternalInfo record, @Param("example") CarInternalInfoExample example);

    int updateByExample(@Param("record") CarInternalInfo record, @Param("example") CarInternalInfoExample example);

    int updateByPrimaryKeySelective(CarInternalInfo record);

    int updateByPrimaryKey(CarInternalInfo record);
}