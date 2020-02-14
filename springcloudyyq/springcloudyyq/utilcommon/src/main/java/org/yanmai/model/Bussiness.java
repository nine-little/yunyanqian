package org.yanmai.model;

import java.util.Date;

public class Bussiness {
    private Integer id;

    private String bussinessid;

    private String typeid;

    private String companyid;

    private String businessName;

    private String ascompany;

    private String contracturl;

    private String publicfileurl;

    private String statu;

    private String memo;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBussinessid() {
        return bussinessid;
    }

    public void setBussinessid(String bussinessid) {
        this.bussinessid = bussinessid == null ? null : bussinessid.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getAscompany() {
        return ascompany;
    }

    public void setAscompany(String ascompany) {
        this.ascompany = ascompany == null ? null : ascompany.trim();
    }

    public String getContracturl() {
        return contracturl;
    }

    public void setContracturl(String contracturl) {
        this.contracturl = contracturl == null ? null : contracturl.trim();
    }

    public String getPublicfileurl() {
        return publicfileurl;
    }

    public void setPublicfileurl(String publicfileurl) {
        this.publicfileurl = publicfileurl == null ? null : publicfileurl.trim();
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}