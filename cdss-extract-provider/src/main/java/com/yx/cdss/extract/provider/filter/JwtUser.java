package com.yx.cdss.extract.provider.filter;

public class JwtUser {
    // 用户名称
    private String userName;
    // 用户ID
    private long id;
    // 用户角色,以英文半角逗号[,]分割
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
