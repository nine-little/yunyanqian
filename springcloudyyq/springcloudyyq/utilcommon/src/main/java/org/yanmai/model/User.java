package org.yanmai.model;

import com.google.gson.Gson;
import net.sf.json.JSONObject;

import java.util.Date;

public class User {
    private Integer id;

    private String userid;

    private String companyid;

    private String uid;

    private String jobNumber;

    private String name;

    private String doccode;

    private String account;

    private String email;

    private String password;

    private String companyname;

    private Date createtime;

    private Integer statu;

    private Integer roleid;

    private String rolename;

    private Integer apporve;

    private Integer registered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode == null ? null : doccode.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getApporve() {
        return apporve;
    }

    public void setApporve(Integer apporve) {
        this.apporve = apporve;
    }

    public Integer getRegistered() {
        return registered;
    }

    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", companyid='" + companyid + '\'' +
                ", uid='" + uid + '\'' +
                ", jobNumber='" + jobNumber + '\'' +
                ", name='" + name + '\'' +
                ", doccode='" + doccode + '\'' +
                ", account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", companyname='" + companyname + '\'' +
                ", createtime=" + createtime +
                ", statu=" + statu +
                ", roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", apporve=" + apporve +
                ", registered=" + registered +
                '}';
    }


}