package com.ysy.music.controller;

import com.ysy.music.utils.DownLoadUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "DownLoad",value="/showDownLoad")
public class ShowDownLoad extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //map集合
        HashMap<String,String> fileMap = new HashMap<>();
        //获取文件在web上发布之后的路径
        String basePath=request.getServletContext().getRealPath("/WEB-INF/upload");
        DownLoadUtils.getFileList(new File(basePath),fileMap);
        request.setAttribute("fileMap",fileMap);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
