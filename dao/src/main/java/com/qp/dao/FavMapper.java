package com.qp.dao;

import com.qp.pojo.Fav;
import com.qp.pojo.FavExample;
import java.util.List;
import com.qp.pojo.FavKey;import org.apache.ibatis.annotations.Param;

public interface FavMapper {
    long countByExample(FavExample example);

    int deleteByExample(FavExample example);

    int deleteByPrimaryKey(@Param("uid") String uid, @Param("carId") String carId);

    int insert(Fav record);

    int insertSelective(Fav record);

    List<Fav> selectByExample(FavExample example);

    int updateByExampleSelective(@Param("record") Fav record, @Param("example") FavExample example);

    int updateByExample(@Param("record") Fav record, @Param("example") FavExample example);

    int deleteByPrimaryKey(FavKey key);

    List<FavKey> selectByUid(String uid);

    List<FavKey> selectByCarId(String carId);
}