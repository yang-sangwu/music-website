package com.ysy.music.controller;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.User;
import com.ysy.music.service.implem.MusicSerImp;
import com.ysy.music.service.implem.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchMusic",value="/searchMusic")
public class SearchMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String attribute=request.getParameter("attribute");
        MusicService musicService=new MusicSerImp();
   //     Music music=musicService.searchMusic(attribute);
        List<Music>music=musicService.searchMusic(attribute);
    //    System.out.println(music+"aaaaaa");
        if(!music.isEmpty()) {
            request.setAttribute("music", music);
            request.getRequestDispatcher("/showSearchMusic.jsp").forward(request, response);
        }else{
        //    request.getRequestDispatcher("/searchMusic.jsp").forward(request,response);
            response.sendRedirect("/WebMusic/searchMusic.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
