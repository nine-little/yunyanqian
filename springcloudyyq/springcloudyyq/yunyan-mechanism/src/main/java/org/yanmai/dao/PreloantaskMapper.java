package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yanmai.model.Preloantask;
import org.yanmai.model.example.PreloantaskExample;
import org.springframework.stereotype.Repository;
@Repository
public interface PreloantaskMapper {
    int countByExample(PreloantaskExample example);

    int deleteByExample(PreloantaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Preloantask record);

    int insertSelective(Preloantask record);

    List<Preloantask> selectByExample(PreloantaskExample example);

    Preloantask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Preloantask record, @Param("example") PreloantaskExample example);

    int updateByExample(@Param("record") Preloantask record, @Param("example") PreloantaskExample example);

    int updateByPrimaryKeySelective(Preloantask record);

    int updateByPrimaryKey(Preloantask record);
}