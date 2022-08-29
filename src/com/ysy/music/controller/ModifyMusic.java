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

@WebServlet(name = "ModifyMusic",value="/modifyMusic")
public class ModifyMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Integer userId=Integer.valueOf(request.getParameter("userId"));
        UserService userService=new UserServiceImp();
        User user=userService.selectOneUser(userId);

        System.out.println(user+"1234561");

        request.setAttribute("user",user);
        request.getRequestDispatcher("/modifyUser.jsp").forward(request,response);
*/
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Integer musicId=Integer.valueOf(request.getParameter("musicId"));
        MusicService musicService=new MusicSerImp();
        Music music=musicService.selectOneMusic(musicId);
        /******/
     //   System.out.println(music+"666");
        request.setAttribute("music",music);
        request.getRequestDispatcher("/modifyMusic.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
