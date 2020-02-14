package org.yanmai.model;

import java.util.Date;

public class Preloantask {
    private Integer id;

    private String orderNumber;

    private String companyUserid;

    private String companyId;

    private String taskId;

    private String taskName;

    private String taskAddress;

    private String businessId;

    private String concatfileurl;

    private String acceptStatu;

    private Date createtasktime;

    private String taskStatu;

    private Integer reviewstatu;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getCompanyUserid() {
        return companyUserid;
    }

    public void setCompanyUserid(String companyUserid) {
        this.companyUserid = companyUserid == null ? null : companyUserid.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(String taskAddress) {
        this.taskAddress = taskAddress == null ? null : taskAddress.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getConcatfileurl() {
        return concatfileurl;
    }

    public void setConcatfileurl(String concatfileurl) {
        this.concatfileurl = concatfileurl == null ? null : concatfileurl.trim();
    }

    public String getAcceptStatu() {
        return acceptStatu;
    }

    public void setAcceptStatu(String acceptStatu) {
        this.acceptStatu = acceptStatu == null ? null : acceptStatu.trim();
    }

    public Date getCreatetasktime() {
        return createtasktime;
    }

    public void setCreatetasktime(Date createtasktime) {
        this.createtasktime = createtasktime;
    }

    public String getTaskStatu() {
        return taskStatu;
    }

    public void setTaskStatu(String taskStatu) {
        this.taskStatu = taskStatu == null ? null : taskStatu.trim();
    }

    public Integer getReviewstatu() {
        return reviewstatu;
    }

    public void setReviewstatu(Integer reviewstatu) {
        this.reviewstatu = reviewstatu;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}