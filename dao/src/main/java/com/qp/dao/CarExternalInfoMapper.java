package com.qp.dao;

import com.qp.pojo.CarExternalInfo;
import com.qp.pojo.CarExternalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarExternalInfoMapper {
    long countByExample(CarExternalInfoExample example);

    int deleteByExample(CarExternalInfoExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarExternalInfo record);

    int insertSelective(CarExternalInfo record);

    List<CarExternalInfo> selectByExample(CarExternalInfoExample example);

    CarExternalInfo selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarExternalInfo record, @Param("example") CarExternalInfoExample example);

    int updateByExample(@Param("record") CarExternalInfo record, @Param("example") CarExternalInfoExample example);

    int updateByPrimaryKeySelective(CarExternalInfo record);

    int updateByPrimaryKey(CarExternalInfo record);
}