package com.Trang.webyte.DTO;

public class RoleDTO {
    public int roleID;
    public String roleName;

    public RoleDTO() {
    }

    public RoleDTO(int roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
