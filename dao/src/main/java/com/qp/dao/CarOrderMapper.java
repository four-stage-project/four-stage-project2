package com.qp.dao;

import com.qp.pojo.CarOrder;
import com.qp.pojo.CarOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarOrderMapper {
    long countByExample(CarOrderExample example);

    int deleteByExample(CarOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(CarOrder record);

    int insertSelective(CarOrder record);

    List<CarOrder> selectByExample(CarOrderExample example);

    CarOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") CarOrder record, @Param("example") CarOrderExample example);

    int updateByExample(@Param("record") CarOrder record, @Param("example") CarOrderExample example);

    int updateByPrimaryKeySelective(CarOrder record);

    int updateByPrimaryKey(CarOrder record);
}