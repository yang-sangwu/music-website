package com.ysy.music.Dao;

import com.ysy.music.entity.Manager;
import com.ysy.music.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();

    public int delete(int userId);
  //  public String delete(String account);
    public int add(User user);
    /********修改*********/
    public User select(int userId);
    public int modify(User user);
    /*******登录*********/
    public User select(String nickname);
    /***vip******/

    public int modifyVIP(User user);

}
