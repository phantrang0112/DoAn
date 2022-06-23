package com.Trang.webyte.DTO;

import io.swagger.models.auth.In;

import java.util.Map;

public class AccountDTO {
    public AccountDTO() {
    }

    public AccountDTO(String password, Integer idrole, Integer id, String username) {
        this.password = password;
        this.idrole = idrole;
        this.id = id;
        this.username = username;
    }

    public AccountDTO(Map<String, Object> obj){
        this.password = (String) obj.get("password");
        this.idrole = (Integer) obj.get("idrole");
        this.id = (Integer) obj.get("id");
        this.username = (String) obj.get("username");
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdrole() {
        return idrole;
    }

    public void setIdrole(Integer idrole) {
        this.idrole = idrole;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
    private Integer idrole;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    private Integer id;
    private String username;
    private  Integer accountId;

    @Override
    public String toString() {
        return "AccountDTO{" +
                "password='" + password + '\'' +
                ", idrole=" + idrole +
                ", id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
