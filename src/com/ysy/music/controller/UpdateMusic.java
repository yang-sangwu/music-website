package com.ysy.music.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static sun.misc.Version.println;

@WebServlet(name = "UpdateMusic",value="/upload")
@MultipartConfig(maxFileSize = 1024*1024*100,maxRequestSize = 1024*1024*200)
public class UpdateMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //在windows中,标准分隔符是   \\  , 换行符是\r\n ,在UNIX中,标准分隔符是  /   ,换行符是\n ,macOS系统中，标准分隔符是/，换行符是\n....

        //设置乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取请求的数据
        Part part=request.getPart("file");//获取文件的数据
//        System.out.println(part.getSize());
        //获取上传文件的路径 真实路径
        //获取文件在web上发布之后的路径
        String uploadPath=request.getServletContext().getRealPath("/WEB-INF/upload");//request.getServletContext().getRealPath 返回的是一个临时文件夹的地址
  //      System.out.println(uploadPath+"123456");
        File file=new File(uploadPath);
        if(!file.exists()){
            file.mkdirs();//新建文件夹
        }
        //判断是否为mp3
        String name=part.getSubmittedFileName();//获取文件名称
        List<String>nameList=new ArrayList<>();
        nameList.add(".mp3");
        String newName=name.substring(name.lastIndexOf("."));//substring为截取字符串
        if(!nameList.contains(newName)){
            //打印输出流
            response.getWriter().print(name+"不符合文件上传类型");
            response.getWriter().write("<img src=\"baofu.png\">");//<img src="baofu.png">
            return;
        }
        //文件上传
        part.write(uploadPath+"/"+part.getSubmittedFileName());
        //响应客户端 上传成功
        response.getWriter().println(part.getSubmittedFileName()+"上传成功！");
   /*     response.getWriter().write("<form action=\"${pageContext.request.contextPath}/ManagerUser\" method=\"post\">\n" +
                "    <input type=\"submit\" value=\"返回\"/>\n" +
                "</form>");*/
    }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
        }
    }
/*
        散列存储 此目录会导致不能上传相同的文件
*/

