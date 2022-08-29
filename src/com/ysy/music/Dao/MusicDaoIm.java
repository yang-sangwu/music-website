package com.ysy.music.Dao;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.entity.User;
import com.ysy.music.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class MusicDaoIm implements MusicDao{
    private QueryRunner qr=new QueryRunner();
    @Override
    public List<Music> selectAll(Page page) {
        try {
            String sql = "select * from music limit ?,?";    //两个参数，第一个是偏移量，第二个是数目
            List<Music> mus = qr.query(DbUtils.getConnection(), sql, new BeanListHandler<Music>(Music.class), page.getStartRows(), page.getPageSize());

     //       System.out.println(mus+"aaaa");
            return mus;

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Override
    public long selectCount() {
        try {
            String sql = "select count(*) from music";   //select * 返回的是 select count（*）返回的是记录的数目
            long count = qr.query(DbUtils.getConnection(), sql, new ScalarHandler<>());

            System.out.println(count);

            return count;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(int musicId) {
        try {
            int result = qr.update(DbUtils.getConnection(), "delete from music where musicId=?", musicId);
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public Music select(int musicId) {
        try {
            Music music = qr.query(DbUtils.getConnection(), "select * from music where musicId=?", new BeanHandler<Music>(Music.class), musicId);
       //     System.out.println(music+"1234");
            return music;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
    /***********搜索音乐************/
    @Override
    public List<Music> search(String attribute) {
        try {
  //          Music music = qr.query(DbUtils.getConnection(), "select * from music where attribute=?", new BeanHandler<Music>(Music.class), attribute);
            List <Music> music= qr.query(DbUtils.getConnection(), "select * from music where attribute=?", new BeanListHandler<Music>(Music.class), attribute);
      //      System.out.println(music+"jjjjj");
            return music;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
/*******搜索一首音乐*********/
    @Override
    public List<Music> selectOne(String name) {
        try {
            List <Music> music = qr.query(DbUtils.getConnection(), "select * from music where name=?", new BeanListHandler<Music>(Music.class), name);
      //      System.out.println(music+"bhcyguyy");
            return music;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }


    /***************修改****************/
    @Override
    public int modify(Music music) {
        try {
            int result = qr.update(DbUtils.getConnection(), "update music set name=?,attribute=?,musicURl=? where musicId=?", music.getName(), music.getAttribute(),music.getMusicUrl(), music.getMusicId());
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Override
    public int add(Music music) {
        try {
            int result = qr.update(DbUtils.getConnection(), "insert into music(name,attribute,musicUrl)values(?,?,?)", music.getName(), music.getAttribute(),music.getMusicUrl());
            return result;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

}
/*
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

*/



