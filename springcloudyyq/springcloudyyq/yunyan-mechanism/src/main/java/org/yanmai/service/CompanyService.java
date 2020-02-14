package org.yanmai.service;

import org.yanmai.model.Company;
import org.yanmai.util.Result;

import java.util.List;

public interface CompanyService {

    Result getCompanyListByRole(Company company);

    Result insertCompany(Company company);

    Result updateCompanyById(Company company);

    Result deleteCompanyById(Company company);

}
