package com.ysy.music.controller;

import com.ysy.music.entity.Music;
import com.ysy.music.service.implem.MusicSerImp;
import com.ysy.music.service.implem.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchOneMusic",value = "/searchOneMusic")
public class SearchOneMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        MusicService musicService=new MusicSerImp();
        List<Music> music=musicService.selectOneMusic(name);
  //      System.out.println(music+"   11111");
        if(!music.isEmpty()) {
            request.setAttribute("music", music);
            request.getRequestDispatcher("/showOneMusic.jsp").forward(request, response);
        }else{
            response.sendRedirect("/WebMusic/noExistent.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
