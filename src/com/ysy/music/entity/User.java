package com.ysy.music.entity;

public class User {
    private int userId;
    private String account;
    private String password;
    private String nickname;
    private int grade;

    public User() {
    }

    
    public User(int userId,String account,String password,String nickname,int grade) {
        this.userId = userId;
        this.account=account;
        this.password=password;
        this.nickname=nickname;
        this.grade=grade;
    }
    public User(String password,String nickname) {
        this.password=password;
        this.nickname=nickname;
    }
    public User(int userId,String account,String password,String nickname) {
        this.userId = userId;
        this.account=account;
        this.password=password;
        this.nickname=nickname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", grade=" + grade +
                '}';
    }
    public User(String account,String password,String nickname) {
        this.account=account;
        this.password=password;
        this.nickname=nickname;
    }
}
