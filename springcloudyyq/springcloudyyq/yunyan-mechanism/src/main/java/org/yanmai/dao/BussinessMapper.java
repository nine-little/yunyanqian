package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yanmai.model.Bussiness;
import org.yanmai.model.example.BussinessExample;

@Repository
public interface BussinessMapper {
    int countByExample(BussinessExample example);

    int deleteByExample(BussinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bussiness record);

    int insertSelective(Bussiness record);

    List<Bussiness> selectByExample(BussinessExample example);

    Bussiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByExample(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByPrimaryKeySelective(Bussiness record);

    int updateByPrimaryKey(Bussiness record);
}