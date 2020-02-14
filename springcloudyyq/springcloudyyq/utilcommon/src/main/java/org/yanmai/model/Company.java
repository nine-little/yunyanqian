package org.yanmai.model;

import java.util.Date;

public class Company {
    private Integer id;

    private String companyid;

    private String companyLoginid;

    private String name;

    private String shortname;

    private String companycode;

    private String email;

    private String contactName;

    private String contactNumber;

    private String companytype;

    private String registeredcode;

    private String registeredurl;

    private Date createtime;

    private String citycode;

    private Integer certifiedstatus;// 审核状态 0 待审核 1未通过 2已通过 3查询全部

    private String certifiedreason;

    private Date certifytime;

    private Integer status;

    private String temp1;

    private String temp2;

    private String temp3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyLoginid() {
        return companyLoginid;
    }

    public void setCompanyLoginid(String companyLoginid) {
        this.companyLoginid = companyLoginid == null ? null : companyLoginid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype == null ? null : companytype.trim();
    }

    public String getRegisteredcode() {
        return registeredcode;
    }

    public void setRegisteredcode(String registeredcode) {
        this.registeredcode = registeredcode == null ? null : registeredcode.trim();
    }

    public String getRegisteredurl() {
        return registeredurl;
    }

    public void setRegisteredurl(String registeredurl) {
        this.registeredurl = registeredurl == null ? null : registeredurl.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public Integer getCertifiedstatus() {
        return certifiedstatus;
    }

    public void setCertifiedstatus(Integer certifiedstatus) {
        this.certifiedstatus = certifiedstatus;
    }

    public String getCertifiedreason() {
        return certifiedreason;
    }

    public void setCertifiedreason(String certifiedreason) {
        this.certifiedreason = certifiedreason == null ? null : certifiedreason.trim();
    }

    public Date getCertifytime() {
        return certifytime;
    }

    public void setCertifytime(Date certifytime) {
        this.certifytime = certifytime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
}