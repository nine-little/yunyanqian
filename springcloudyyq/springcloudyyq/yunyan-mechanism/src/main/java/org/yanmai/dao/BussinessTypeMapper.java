package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yanmai.model.BussinessType;
import org.yanmai.model.example.BussinessTypeExample;
@Repository
public interface BussinessTypeMapper {
    int countByExample(BussinessTypeExample example);

    int deleteByExample(BussinessTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BussinessType record);

    int insertSelective(BussinessType record);

    List<BussinessType> selectByExample(BussinessTypeExample example);

    BussinessType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BussinessType record, @Param("example") BussinessTypeExample example);

    int updateByExample(@Param("record") BussinessType record, @Param("example") BussinessTypeExample example);

    int updateByPrimaryKeySelective(BussinessType record);

    int updateByPrimaryKey(BussinessType record);
}