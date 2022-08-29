package com.ysy.music.controller;

import com.ysy.music.entity.Music;
import com.ysy.music.entity.Page;
import com.ysy.music.service.implem.MusicSerImp;
import com.ysy.music.service.implem.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "seawallMusCon",value="/showAllMusic")
public class seawallMusCon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //显示所有的音乐
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

    //    System.out.println("跳转成功！");

        String pageIndex=request.getParameter("pageIndex");
        if(pageIndex==null){
            pageIndex="1";
        }
        Page page=new Page(Integer.valueOf(pageIndex));
        MusicService musicSer=new MusicSerImp();
        List<Music> music=musicSer.showAllMusicPage(page);

  //     System.out.println("遍历音乐");
   //     System.out.println(music);

        request.setAttribute("musicBy",music);
        request.setAttribute("page",page);
        request.getRequestDispatcher("/music.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
