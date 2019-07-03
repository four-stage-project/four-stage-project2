package com.qp.dao;

import com.qp.pojo.HistoryOrder;
import com.qp.pojo.HistoryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryOrderMapper {
    long countByExample(HistoryOrderExample example);

    int deleteByExample(HistoryOrderExample example);

    int deleteByPrimaryKey(String historyId);

    int insert(HistoryOrder record);

    int insertSelective(HistoryOrder record);

    List<HistoryOrder> selectByExample(HistoryOrderExample example);

    HistoryOrder selectByPrimaryKey(String historyId);

    int updateByExampleSelective(@Param("record") HistoryOrder record, @Param("example") HistoryOrderExample example);

    int updateByExample(@Param("record") HistoryOrder record, @Param("example") HistoryOrderExample example);

    int updateByPrimaryKeySelective(HistoryOrder record);

    int updateByPrimaryKey(HistoryOrder record);
}