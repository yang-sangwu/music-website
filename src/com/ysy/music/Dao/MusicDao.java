package com.ysy.music.Dao;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.entity.User;

import java.util.List;

public interface MusicDao {
    public List<Music> selectAll(Page page);
    public long selectCount();
    /****音乐操作******/
    public int delete(int musicId);
    /******修改*******/
    public Music select(int musicId);
    public int modify(Music music);
    /***增加****/
    public int add(Music music);
    /******搜索音乐*******/
    public List<Music> search(String attribute);
    /****搜索一首音乐******/
    public List<Music> selectOne(String name);
}