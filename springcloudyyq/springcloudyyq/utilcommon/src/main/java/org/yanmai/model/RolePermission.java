package org.yanmai.model;

public class RolePermission {
    private Integer rolePerId;

    private Integer roleId;

    private Integer perId;

    private String notes;

    private Short dataState;

    public Integer getRolePerId() {
        return rolePerId;
    }

    public void setRolePerId(Integer rolePerId) {
        this.rolePerId = rolePerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Short getDataState() {
        return dataState;
    }

    public void setDataState(Short dataState) {
        this.dataState = dataState;
    }
}