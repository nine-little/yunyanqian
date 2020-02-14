package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yanmai.model.UserTaskLog;
import org.yanmai.model.example.UserTaskLogExample;
import org.springframework.stereotype.Repository;
@Repository
public interface UserTaskLogMapper {
    int countByExample(UserTaskLogExample example);

    int deleteByExample(UserTaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaskLog record);

    int insertSelective(UserTaskLog record);

    List<UserTaskLog> selectByExample(UserTaskLogExample example);

    UserTaskLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTaskLog record, @Param("example") UserTaskLogExample example);

    int updateByExample(@Param("record") UserTaskLog record, @Param("example") UserTaskLogExample example);

    int updateByPrimaryKeySelective(UserTaskLog record);

    int updateByPrimaryKey(UserTaskLog record);
}