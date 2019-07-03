package com.qp.dao;

import com.qp.pojo.Pic;
import com.qp.pojo.PicKey;


public interface PicMapper {
    int deleteByPrimaryKey(PicKey key);

    int insert(Pic record);

    int insertSelective(Pic record);

    Pic selectByPrimaryKey(PicKey key);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);
}