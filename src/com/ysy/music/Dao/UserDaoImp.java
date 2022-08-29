package com.ysy.music.Dao;

import com.ysy.music.entity.User;
import com.ysy.music.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImp implements UserDao{
    private QueryRunner queryRunner=new QueryRunner();
    @Override
    public List<User> selectAll() {
        try {
            List<User>user=queryRunner.query(DbUtils.getConnection(), "select * from user", new BeanListHandler<User>(User.class));
        //    System.out.println(user+"我是selectAll方法");
            return user;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public int delete(int userId) {
        try {
            int result = queryRunner.update(DbUtils.getConnection(), "delete from user where userId=?", userId);
       //     System.out.println("用到了delete方法");
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public int add(User user) {
        try {
            String sql = "insert into user(account,password,nickname)values(?,?,?)";
            int result = queryRunner.update(DbUtils.getConnection(), sql, user.getAccount(), user.getPassword(), user.getNickname());
              return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public User select(int userId) {
        try {
            String sql = "select * from user where userId=?";
            User user = queryRunner.query(DbUtils.getConnection(), sql, new BeanHandler<User>(User.class), userId);
            return user;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public int modify(User user) {
        try {
            String sql = "update user set account=?,password=?,nickname=? where userId=?";
            int result = queryRunner.update(DbUtils.getConnection(), sql, user.getAccount(), user.getPassword(), user.getNickname(),user.getUserId());

        //    System.out.println(result+"1111111");

            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public User select(String nickname) {
        try {
            String sql = "select * from user where nickname=?;";
            User user = queryRunner.query(DbUtils.getConnection(), sql, new BeanHandler<User>(User.class), nickname);
            System.out.println(user+"66666");
            return user;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public int modifyVIP(User user) {
        try {
            String sql = "update user set grade=1 where nickname=?";
            int result = queryRunner.update(DbUtils.getConnection(), sql, user.getNickname());
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }


/*    @Override
    public User search(String nickname) {
        try
        String sql="select * from user where nickname=?";
        User user = queryRunner.query(DbUtils.getConnection(), sql, new BeanHandler<User>(User.class), nickname);

        return null;
    }
*/






 /* private QueryRunner queryRunner=new QueryRunner();
   // @Override
    public  Manager select(String username) {
        try {
            Manager manager = queryRunner.query(DbUtils.getConnection(), "select * from manager where username=?;", new BeanHandler<Manager>(Manager.class), username);
            return manager;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }//
   @Override
    public String delete(String account) {

        return 0;


        try {
            String result=queryRunner.update(DbUtils.getConnection(), "delete from user where account=?", account);
            System.out.println("用到了delete方法");
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;


    }
  */




}

