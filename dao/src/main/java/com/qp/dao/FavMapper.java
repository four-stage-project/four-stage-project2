package com.qp.dao;

import com.qp.pojo.FavKey;

import java.util.List;

public interface FavMapper {
    int deleteByPrimaryKey(FavKey key);

    int insert(FavKey record);

    int insertSelective(FavKey record);

    List<FavKey> selectByUid(String uid);

    List<FavKey> selectByCarId(String carId);
}