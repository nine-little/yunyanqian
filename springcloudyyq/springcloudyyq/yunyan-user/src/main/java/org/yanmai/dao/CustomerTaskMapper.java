package org.yanmai.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yanmai.model.CustomerTask;
import org.yanmai.model.CustomerTaskKey;
import org.yanmai.model.example.CustomerTaskExample;

import java.util.List;

@Repository
public interface CustomerTaskMapper {
    int countByExample(CustomerTaskExample example);

    int deleteByExample(CustomerTaskExample example);

    int deleteByPrimaryKey(CustomerTaskKey key);

    int insert(CustomerTask record);

    int insertSelective(CustomerTask record);

    List<CustomerTask> selectByExample(CustomerTaskExample example);

    CustomerTask selectByPrimaryKey(CustomerTaskKey key);

    int updateByExampleSelective(@Param("record") CustomerTask record, @Param("example") CustomerTaskExample example);

    int updateByExample(@Param("record") CustomerTask record, @Param("example") CustomerTaskExample example);

    int updateByPrimaryKeySelective(CustomerTask record);

    int updateByPrimaryKey(CustomerTask record);
}