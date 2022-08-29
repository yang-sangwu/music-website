package com.ysy.music.service.implem;

import com.alibaba.druid.support.profile.ProfileEntryReqStat;
import com.ysy.music.Dao.MusicDao;
import com.ysy.music.Dao.MusicDaoIm;
import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.entity.User;
import com.ysy.music.utils.DbUtils;

import java.util.ArrayList;
import java.util.List;

public class MusicSerImp implements MusicService{
    private MusicDao musicDao=new MusicDaoIm();
    @Override
    public List<Music> showAllMusicPage(Page page) {
        List<Music> music=null;
        try {
            DbUtils.begin();
            long count = musicDao.selectCount();
            page.setAllCounts((int) count);
            music = musicDao.selectAll(page);
            DbUtils.commit();

  //          System.out.println(music+"123345");

        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return music;
    }

    @Override
    public int deleteMusic(int musicId) {
        int result=0;
        try {
            DbUtils.begin();
            result = musicDao.delete(musicId);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Music selectOneMusic(int musicId) {
        Music music=null;
        try {
            DbUtils.begin();
            music = musicDao.select(musicId);
            DbUtils.commit();
        //    System.out.println(music+"11112222");
        }catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return music;
    }
    @Override
    public List<Music> selectOneMusic(String name) {
        List<Music>music=new ArrayList<>();
        try {
            DbUtils.begin();
            List<Music> music1 = musicDao.selectOne(name);
            if (!music1.isEmpty()) {
                music = music1;
            }
      //      System.out.println(music+"mnmnmnmnmn");
            DbUtils.commit();
            //    System.out.println(music+"11112222");
        }catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return music;
    }

    @Override
    public List<Music> searchMusic(String attribute) {
        List<Music>music=new ArrayList<>();
        try {
            DbUtils.begin();
            List<Music>music1 = musicDao.search(attribute);
    //        System.out.println(music1+"bbbbbb");
            if (music1 != null) {
                music = music1;
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return music;
    }


    /*
 */
    @Override
    public int modifyMusic(Music music) {
        int result=0;
        try {
            DbUtils.begin();
            result = musicDao.modify(music);
            DbUtils.commit();
        }catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int addMusic(Music music) {
        int result=0;
        try {
            DbUtils.begin();
            result = musicDao.add(music);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }



}
/*


*/