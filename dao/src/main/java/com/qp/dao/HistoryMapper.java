package com.qp.dao;

import com.qp.pojo.History;

import java.util.List;

public interface HistoryMapper {
    int deleteByPrimaryKey(String historyId);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(String historyId);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);

    List<History> selectBySellerId(String sid);

}