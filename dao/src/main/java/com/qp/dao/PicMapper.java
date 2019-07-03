package com.qp.dao;

import com.qp.pojo.Pic;
import com.qp.pojo.PicExample;
import java.util.List;
import com.qp.pojo.PicKey;import org.apache.ibatis.annotations.Param;

public interface PicMapper {
    long countByExample(PicExample example);

    int deleteByExample(PicExample example);

    int deleteByPrimaryKey(@Param("picId") String picId, @Param("carId") String carId);

    int insert(Pic record);

    int insertSelective(Pic record);

    List<Pic> selectByExample(PicExample example);

    Pic selectByPrimaryKey(@Param("picId") String picId, @Param("carId") String carId);

    int updateByExampleSelective(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByExample(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);

    int deleteByPrimaryKey(PicKey key);

    Pic selectByPrimaryKey(PicKey key);
}