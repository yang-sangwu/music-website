package com.ysy.music.service.implem;

import com.ysy.music.entity.Manager;
import com.ysy.music.entity.User;

import java.util.List;

public interface UserService {
    public List<User> showAllUser();

    public int deleteUser(int userId);
    public int addUser(User user);
    public User selectOneUser(int userId);
    public int modifyUser(User user);
    /******用户登录******/
    public User sign(String nickname, String password) ;
    /******成为VIP********/
/*    public User selectOneVIP(String nickname,String password);*///使用sign方法
    public int modifyTheVIP(User user);
}
