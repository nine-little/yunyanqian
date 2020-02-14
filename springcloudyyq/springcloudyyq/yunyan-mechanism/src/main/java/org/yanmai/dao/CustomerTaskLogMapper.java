package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yanmai.model.CustomerTaskLog;
import org.yanmai.model.example.CustomerTaskLogExample;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerTaskLogMapper {
    int countByExample(CustomerTaskLogExample example);

    int deleteByExample(CustomerTaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTaskLog record);

    int insertSelective(CustomerTaskLog record);

    List<CustomerTaskLog> selectByExample(CustomerTaskLogExample example);

    CustomerTaskLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerTaskLog record, @Param("example") CustomerTaskLogExample example);

    int updateByExample(@Param("record") CustomerTaskLog record, @Param("example") CustomerTaskLogExample example);

    int updateByPrimaryKeySelective(CustomerTaskLog record);

    int updateByPrimaryKey(CustomerTaskLog record);
}