package org.yanmai.model;

import java.util.Date;

public class CustomerTask extends CustomerTaskKey {
    private Date createtime;

    private Integer atStep;

    private String customerdoccode;

    private String customersex;

    private String customernation;

    private String customerbirthday;

    private String customerauthority;

    private String customerexpdate;

    private String customeridheadurl;

    private String customeraddress;

    private String identityfacadefileurl;

    private String identitybackfileurl;

    private String scenephotofileurl;

    private String signaturefileurl;

    private String tapefileurl;

    private Integer isfacecompare;

    private Integer gridphotosource;

    private Integer callStatus;

    private String faceMemo;

    private Date faceTime;

    private String faceStatu;

    private Integer ismain;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getAtStep() {
        return atStep;
    }

    public void setAtStep(Integer atStep) {
        this.atStep = atStep;
    }

    public String getCustomerdoccode() {
        return customerdoccode;
    }

    public void setCustomerdoccode(String customerdoccode) {
        this.customerdoccode = customerdoccode == null ? null : customerdoccode.trim();
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public String getCustomernation() {
        return customernation;
    }

    public void setCustomernation(String customernation) {
        this.customernation = customernation == null ? null : customernation.trim();
    }

    public String getCustomerbirthday() {
        return customerbirthday;
    }

    public void setCustomerbirthday(String customerbirthday) {
        this.customerbirthday = customerbirthday == null ? null : customerbirthday.trim();
    }

    public String getCustomerauthority() {
        return customerauthority;
    }

    public void setCustomerauthority(String customerauthority) {
        this.customerauthority = customerauthority == null ? null : customerauthority.trim();
    }

    public String getCustomerexpdate() {
        return customerexpdate;
    }

    public void setCustomerexpdate(String customerexpdate) {
        this.customerexpdate = customerexpdate == null ? null : customerexpdate.trim();
    }

    public String getCustomeridheadurl() {
        return customeridheadurl;
    }

    public void setCustomeridheadurl(String customeridheadurl) {
        this.customeridheadurl = customeridheadurl == null ? null : customeridheadurl.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getIdentityfacadefileurl() {
        return identityfacadefileurl;
    }

    public void setIdentityfacadefileurl(String identityfacadefileurl) {
        this.identityfacadefileurl = identityfacadefileurl == null ? null : identityfacadefileurl.trim();
    }

    public String getIdentitybackfileurl() {
        return identitybackfileurl;
    }

    public void setIdentitybackfileurl(String identitybackfileurl) {
        this.identitybackfileurl = identitybackfileurl == null ? null : identitybackfileurl.trim();
    }

    public String getScenephotofileurl() {
        return scenephotofileurl;
    }

    public void setScenephotofileurl(String scenephotofileurl) {
        this.scenephotofileurl = scenephotofileurl == null ? null : scenephotofileurl.trim();
    }

    public String getSignaturefileurl() {
        return signaturefileurl;
    }

    public void setSignaturefileurl(String signaturefileurl) {
        this.signaturefileurl = signaturefileurl == null ? null : signaturefileurl.trim();
    }

    public String getTapefileurl() {
        return tapefileurl;
    }

    public void setTapefileurl(String tapefileurl) {
        this.tapefileurl = tapefileurl == null ? null : tapefileurl.trim();
    }

    public Integer getIsfacecompare() {
        return isfacecompare;
    }

    public void setIsfacecompare(Integer isfacecompare) {
        this.isfacecompare = isfacecompare;
    }

    public Integer getGridphotosource() {
        return gridphotosource;
    }

    public void setGridphotosource(Integer gridphotosource) {
        this.gridphotosource = gridphotosource;
    }

    public Integer getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Integer callStatus) {
        this.callStatus = callStatus;
    }

    public String getFaceMemo() {
        return faceMemo;
    }

    public void setFaceMemo(String faceMemo) {
        this.faceMemo = faceMemo == null ? null : faceMemo.trim();
    }

    public Date getFaceTime() {
        return faceTime;
    }

    public void setFaceTime(Date faceTime) {
        this.faceTime = faceTime;
    }

    public String getFaceStatu() {
        return faceStatu;
    }

    public void setFaceStatu(String faceStatu) {
        this.faceStatu = faceStatu == null ? null : faceStatu.trim();
    }

    public Integer getIsmain() {
        return ismain;
    }

    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }
}