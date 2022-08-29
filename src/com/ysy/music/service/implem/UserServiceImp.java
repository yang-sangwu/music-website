package com.ysy.music.service.implem;

import com.ysy.music.Dao.UserDao;
import com.ysy.music.Dao.UserDaoImp;
import com.ysy.music.entity.User;
import com.ysy.music.utils.DbUtils;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService{
    private UserDao userDao=new UserDaoImp();

    @Override
    public List<User> showAllUser() {
        List<User>users=new ArrayList<>();
        try {
            DbUtils.begin();

            List<User> tem = userDao.selectAll();
            if (tem != null) {
                users = tem;
            }
            DbUtils.commit();

   //         System.out.println(users+"我是showAllUser方法");

        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public int deleteUser(int userId) {
        int result=0;
        try {
            DbUtils.begin();
            result = userDao.delete(userId);
  //          System.out.println("用到了deleteUser方法");
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int addUser(User user) {
        int result=0;
        try {
            DbUtils.begin();
            result = userDao.add(user);
 //           System.out.println("user");
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public User selectOneUser(int userId) {
        User user=null;
        try {
            DbUtils.begin();
            user = userDao.select(userId);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return user;
    }



    @Override
    public int modifyUser(User user) {
        int result=0;
        try {
            DbUtils.begin();
            result = userDao.modify(user);

  //          System.out.println(user+"222222");

            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int modifyTheVIP(User user) {
        int result=0;
        try {
            DbUtils.begin();
            result = userDao.modifyVIP(user);
            DbUtils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

 /*   @Override
    public User selectOneVIP(String nickname,String password) {
        User user=null;
        try {
            DbUtils.begin();
            User temp = userDao.select(nickname);
            if (temp != null) {
                if (temp != null) {
                    if (temp.getPassword().equals(password)) ;
                    user = temp;
                }
            }
            DbUtils.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    */
    @Override
    public User sign(String nickname, String password) {
        User user=null;
        try {
            DbUtils.begin();
            User temp = userDao.select(nickname);
            if (temp != null) {
                    if (temp.getPassword().equals(password)) { //temp.getPassword()  public String getPassword() {return password; }
                        user = temp;
                    }
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return user;
    }
}
/*private ManagerDao managerDao=new ManagerDaoIm();
    @Override
    public Manager login(String username, String password) {
        Manager manager=null;
        try {
            DbUtils.begin();
            Manager temp = managerDao.select(username);
            if (temp != null) {
                if (temp.getPassword().equals(password)) {
                    manager = temp;
                }
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return manager;
    }*/
