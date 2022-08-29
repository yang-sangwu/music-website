package com.ysy.music.utils;
//对数据库连接池的获取以及对事物的控制


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtils {
    private static DruidDataSource ds;
    private static final ThreadLocal<Connection> THREAD_LOCAL=new ThreadLocal<>();//THREAD_LOCAL保证线程安全
    static{
        Properties properties=new Properties();
        InputStream inputStream=DbUtils.class.getResourceAsStream("/database.properties");
        try{
            properties.load(inputStream);
            ds=(DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection(){   //获取数据库连接对象
        Connection connection=THREAD_LOCAL.get();
        try{
            if(connection==null){
                connection=ds.getConnection();
                THREAD_LOCAL.set(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void begin(){     //控制事物
        Connection connection=null;
        try{
            connection=getConnection();
            connection.setAutoCommit(false);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
    public static void commit(){        //事物的提交
        Connection connection=null;
        try{
            connection=getConnection();
            connection.commit();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }finally {
            closeAll(connection,null,null);
        }
    }
    public static void rollback(){      //事物的回滚
        Connection connection=null;
        try{
            connection=getConnection();
            connection.rollback();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }finally {
            closeAll(connection,null,null);
        }
    }
    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet){   //

        try{
            if(resultSet!=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(resultSet!=null){
                resultSet.close();
                THREAD_LOCAL.remove();
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }



}
