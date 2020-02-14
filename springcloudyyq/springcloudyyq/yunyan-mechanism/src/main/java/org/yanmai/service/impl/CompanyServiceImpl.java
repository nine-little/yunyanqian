package org.yanmai.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yanmai.dao.CompanyMapper;
import org.yanmai.dao.LoginMapper;
import org.yanmai.dao.UserMapper;
import org.yanmai.model.Company;
import org.yanmai.model.Login;
import org.yanmai.model.User;
import org.yanmai.model.example.UserExample;
import org.yanmai.params.ConfigParams;
import org.yanmai.service.CompanyService;
import org.yanmai.util.Md5Util;
import org.yanmai.util.RandomUtil;
import org.yanmai.util.Result;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @program: springcloudyyq
 * @description:
 * @author: wanghongliang
 * @create: 2020-02-13 13:16
 **/
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private UserMapper userMapper;


    /**
     * @param company
     * @return
     */
    @Override
    public Result getCompanyListByRole(Company company) {
        List<Company> companyList = null;
        try {
            companyList = companyMapper.getCompanyListByRole(company);
        } catch (Exception e) {
            //logger.info()
            companyList = null;
        }
        return new Result(200, companyList);
    }

    @Override
    public Result insertCompany(Company company) {
        try {
            //创建企业
            company.setTemp1("测试");
            company.setCertifiedstatus(0);
            company.setCompanyid(RandomUtil.getNumber(6).toString());
            company.setCreatetime(new Date());
            Integer idCompany = companyMapper.insert(company);
            //创建企业管理员
            User user = new User();
            user.setUserid(getCode());
            user.setUid(RandomUtil.getNumber(16));
            user.setJobNumber("管理员");
            user.setCompanyid(company.getCompanyid());
            user.setCompanyname(company.getName());
            user.setAccount(company.getCompanyLoginid());
            user.setName(company.getName());
            user.setPassword(Md5Util.encrypt("123456"));
            user.setRoleid(2);
            user.setRolename("企业管理员");
            //0 注册过企业  1未注册过
            user.setRegistered(0);
            user.setStatu(0);
            //1 认证电子签名 2 未认证电子签名
            user.setApporve(2);
            Integer idUser = userMapper.insert(user);
            //记录原密码和加密后密码
            Login login = new Login();
            login.setUserid(user.getUserid());
            login.setAccount(user.getAccount());
            login.setUid(user.getUid());
            login.setPassword("123456");
            login.setPasswordmd5(user.getPassword());
            Integer idLogin = loginMapper.insert(login);
            return new Result(200, "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400, "注册失败");
        }
    }

    @Override
    public Result updateCompanyById(Company company) {
        try {

            //修改企业
            companyMapper.updateByPrimaryKeySelective(company);
            //修改用户
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andAccountEqualTo(company.getCompanyLoginid());
            List<User> users = userMapper.selectByExample(example);
            User user = users.get(0);


        } catch (Exception e) {
            //logger.info()
            e.getStackTrace();
            return new Result(400, "修改失败");

        }
        return new Result(200, "修改成功");
    }

    @Override
    public Result deleteCompanyById(Company company) {
        try {
            //删除用于企业有关联的数据
            //先删除
            //t_business
            //preloantask
            //t_log_user_task
            //login
            //user
            //删除企业
            companyMapper.deleteByPrimaryKey(company.getId());
        } catch (Exception e) {
            //logger.info()
            e.printStackTrace();
            return new Result(400, "删除失败");

        }
        return new Result(200, "删除陈宫");
    }

    /**
     * 获取userid
     */
    public String getCode() {
        synchronized (this) {
            String code = UUID.randomUUID().toString().split("-")[0];
            code = ConfigParams.SERVERNAME + code;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return code;
        }
    }

    /**
     * 随机字符串
     * <p>
     * str 前缀 size =(str.length+随机数长度)
     */
    private static String randomNumber(String str, int size) {
        if (size < str.length()) {
            return str;
        }
        Random random = new Random();
        int j = size - str.length();
        for (int i = 0; i < j; i++) {
            str = str + random.nextInt(10);
        }
        return str;
    }

}
