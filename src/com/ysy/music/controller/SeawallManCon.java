package com.ysy.music.controller;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.service.implem.MusicSerImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SeawallManCon",value=("/manager/safe/showAllManager"))
public class SeawallManCon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //显示所有的用户
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        //一般通过表单和链表传递的参数使用
       /*String pageIndex=request.getParameter("pageIndex");
        if(pageIndex==null){
            pageIndex="1";
        }
        Page page=new Page(Integer.valueOf(pageIndex));
        MusicSerImp musicSerImp=new MusicSerImp();
        List<Music>music=musicSerImp.showAllMusicPage(page);
        request.setAttribute("music",music);
        response.sendRedirect("");
        */
   //     response.sendRedirect("/showAllUser");
    //    System.out.println("展示所有用户");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
