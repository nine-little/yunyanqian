package org.yanmai.model;

import java.util.Date;

public class BussinessType {
    private Integer id;

    private String type;

    private String typeName;

    private String idinformation;

    private String isuploadfile;

    private String isface;

    private String memo;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getIdinformation() {
        return idinformation;
    }

    public void setIdinformation(String idinformation) {
        this.idinformation = idinformation == null ? null : idinformation.trim();
    }

    public String getIsuploadfile() {
        return isuploadfile;
    }

    public void setIsuploadfile(String isuploadfile) {
        this.isuploadfile = isuploadfile == null ? null : isuploadfile.trim();
    }

    public String getIsface() {
        return isface;
    }

    public void setIsface(String isface) {
        this.isface = isface == null ? null : isface.trim();
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