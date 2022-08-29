package com.ysy.music.controller;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.entity.User;
import com.ysy.music.service.implem.MusicSerImp;
import com.ysy.music.service.implem.MusicService;
import com.ysy.music.service.implem.UserService;
import com.ysy.music.service.implem.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeleteMusic",value="/deleteMusic")
public class DeleteMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String req=request.getParameter("MusicId");
        Integer musicId=Integer.valueOf(req);
        String pageIndex=request.getParameter("pageIndex");
        if(pageIndex==null){
            pageIndex="1";
        }
        Page page=new Page(Integer.valueOf(pageIndex));

        MusicService musicService=new MusicSerImp();
        List<Music>musicList1=musicService.showAllMusicPage(page);
        musicService.deleteMusic(musicId);
        response.sendRedirect(request.getContextPath()+"/musicOperation");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}