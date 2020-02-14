package org.yanmai.model;

public class Permission {
    private Integer perId;

    private Short oprtTypeId;

    private Integer supPerId;

    private Short perLevel;

    private String perCode;

    private String perName;

    private String perDesc;

    private Integer perOrder;

    private String perUrl;

    private Short dataState;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public Short getOprtTypeId() {
        return oprtTypeId;
    }

    public void setOprtTypeId(Short oprtTypeId) {
        this.oprtTypeId = oprtTypeId;
    }

    public Integer getSupPerId() {
        return supPerId;
    }

    public void setSupPerId(Integer supPerId) {
        this.supPerId = supPerId;
    }

    public Short getPerLevel() {
        return perLevel;
    }

    public void setPerLevel(Short perLevel) {
        this.perLevel = perLevel;
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode == null ? null : perCode.trim();
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerDesc() {
        return perDesc;
    }

    public void setPerDesc(String perDesc) {
        this.perDesc = perDesc == null ? null : perDesc.trim();
    }

    public Integer getPerOrder() {
        return perOrder;
    }

    public void setPerOrder(Integer perOrder) {
        this.perOrder = perOrder;
    }

    public String getPerUrl() {
        return perUrl;
    }

    public void setPerUrl(String perUrl) {
        this.perUrl = perUrl == null ? null : perUrl.trim();
    }

    public Short getDataState() {
        return dataState;
    }

    public void setDataState(Short dataState) {
        this.dataState = dataState;
    }
}