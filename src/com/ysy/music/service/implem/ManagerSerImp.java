package com.ysy.music.service.implem;

import com.ysy.music.Dao.ManagerDao;
import com.ysy.music.entity.Manager;
import com.ysy.music.Dao.ManagerDaoIm;
import com.ysy.music.utils.DbUtils;

public class ManagerSerImp implements ManagerService {
    private ManagerDao managerDao=new ManagerDaoIm();
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
    }
}
