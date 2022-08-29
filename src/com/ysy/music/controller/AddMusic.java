package com.ysy.music.controller;

import com.ysy.music.entity.Music;
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

@WebServlet(name = "AddMusic",value="/addMusic")
public class AddMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String attribute=request.getParameter("attribute");
        String musicUrl=request.getParameter("musicUrl");
        Music music=new Music(name,attribute,musicUrl);
        MusicService musicService=new MusicSerImp();
        musicService.addMusic(music);
        response.sendRedirect(request.getContextPath()+"/musicOperation");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
