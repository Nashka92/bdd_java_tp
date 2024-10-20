package org.example.Model;

public class User {
    private String email;
    private String username;
    private String password;
    private boolean loginSuccess;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.loginSuccess = loginSuccess;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }
}