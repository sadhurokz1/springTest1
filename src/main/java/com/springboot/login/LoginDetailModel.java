package com.springboot.login;

public class LoginDetailModel {
     private String username;
     private String password;

    public LoginDetailModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginDetailModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
