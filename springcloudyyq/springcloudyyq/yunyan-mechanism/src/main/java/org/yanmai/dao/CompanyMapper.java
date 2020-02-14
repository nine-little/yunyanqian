package org.yanmai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yanmai.model.Company;

@Repository
public interface CompanyMapper {

    Company selectByPrimaryKey(Integer id);

    int insert(Company record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    List<Company> getCompanyListByRole(@Param("company")Company company);
}