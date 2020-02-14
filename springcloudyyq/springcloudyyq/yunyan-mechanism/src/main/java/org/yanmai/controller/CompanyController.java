package org.yanmai.controller;


import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yanmai.model.Company;
import org.yanmai.model.User;
import org.yanmai.params.ConfigParams;
import org.yanmai.service.CompanyService;
import org.yanmai.util.RandomUtil;
import org.yanmai.util.Result;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @program: springcloudyyq
 * @description:
 * @author: wanghongliang
 * @create: 2020-02-13 13:10
 **/
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private HttpSession session;

    @Autowired
    private CompanyService companyService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 企业注册发送验证码
     *
     * @param telephone
     * @return
     */
    @RequestMapping("/sendSms")
    public Result sendSms(String telephone) {
        // 获取验证码
        String verificationCode = RandomUtil.getNumber(4);
        //保存code
        session.setAttribute(telephone, verificationCode);
        //以秒为单位
        session.setMaxInactiveInterval(60 * 60);
        //打印验证码
        System.err.println("手机号码的验证码:" + verificationCode);
        //发送短信
        try {
            //调用工具类发送短信验证码
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400, "发送失败");
        }
        return new Result(200, "发送成功");
    }

    /**
     * 注册企业
     *
     * @param checkcode
     * @param company
     * @return
     */
    @RequestMapping("/registCompany")
    public Result regist(String checkcode, Company company) {
        //  教研  session中的手机号码的验证码   从/regist/sendSms中的session中获取
        String verificationCode = session.getAttribute(company.getContactNumber()).toString();
//        System.err.println("手机号码的验证码:" + verificationCode);
        //判断传递验证码和存储的验证码是否一致
        if (verificationCode != null && !"".equals(verificationCode.trim())) {
            if (verificationCode.equals(checkcode)) {
                //移除验证码
                session.removeAttribute(company.getContactNumber());
                //注册企业
                Result result = companyService.insertCompany(company);
                return result;
            }
        }

        return new Result(1, "验证码无效或验证码错误");
    }


    /**
     * 大管理员--企业审核/维护列表
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping("/getCompanyListByRole")
    public Result getCompanyListByRole(Company company) {
        //  User user = getUserFromRedis();

        Result result = companyService.getCompanyListByRole(company);
        return result;
    }

    /**
     * 新增企业
     *
     * @param company
     * @return
     */
    @RequestMapping("/insertCompany")
    public Result insertCompany(Company company) {
        Result result = new Result();
        if (company != null && company.getCompanyLoginid() != null) {
            result = companyService.insertCompany(company);
        }
        return result;
    }

    /**
     * 修改机构
     *
     * @param company
     * @return
     */
    @RequestMapping("/updateCompanyById")
    public Result updateCompanyById(Company company) {
//        User user = getUserFromRedis();

        Result result = companyService.updateCompanyById(company);
        return result;
    }

    /**
     * 删除企业
     *
     * @param company
     * @return
     */
    @RequestMapping("/deleteCompanyById")
    public Result deleteCompanyById(Company company) {
//        User user = getUserFromRedis();

        Result result = companyService.deleteCompanyById(company);
        return result;
    }

    /**
     * 从redis中获取User对象
     *
     * @return
     */
    public User getUserFromRedis() {
        User user = null;
        String userToString = redisTemplate.opsForValue().get("user").toString();
        if (userToString.equals("") || userToString == null) {
            return user;
        }
        JSONObject jsonObject = JSONObject.fromObject(userToString);
        user = (User) JSONObject.toBean(jsonObject, User.class);
        return user;
    }
}
