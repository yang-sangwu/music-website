package com.ysy.music.Dao;

import com.ysy.music.entity.Manager;
import com.ysy.music.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class ManagerDaoIm implements ManagerDao{
    private QueryRunner queryRunner=new QueryRunner();
   // @Override
    public  Manager select(String username) {
        try {
            Manager manager = queryRunner.query(DbUtils.getConnection(), "select * from manager where username=?;", new BeanHandler<Manager>(Manager.class), username);
            return manager;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
