package com.ysy.music.service.implem;

import com.ysy.music.entity.Manager;
import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.entity.User;

import java.util.List;

public interface MusicService {
    public List<Music> showAllMusicPage(Page page);
    /******操作音乐*******/
    public int deleteMusic(int musicId);
    public Music selectOneMusic(int musicId);
    public int modifyMusic(Music music);
    public int addMusic(Music music);
    /*******搜索音乐**********/
    public List<Music> searchMusic(String attribute);
    /*******搜索一首音乐**********/
    public List<Music> selectOneMusic(String name);
}
