package com.ysy.music.controller;

import com.ysy.music.utils.DownLoadUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "DownLoadMusic",value="/downLoadMusic")
public class DownLoadMusic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String basePath=request.getServletContext().getRealPath("/WEB-INF" +"/upload");//取得应用绝对路径
    //    System.out.println(basePath+"11111");
        String leftFileName = request.getParameter("filename");
        //通过-拆分
        String filename=leftFileName.split("-")[1];
   //     System.out.println(filename+"22222");
        //通过工具类，使用源文件名称获得路径，就是下载的路径
   //     String downPath= DownLoadUtils.newFilePath(basePath,filename);
//        String downPath="/WebMusic/web/upload";
        //设置响应头，响应的文件类型和如何处理该文件 附件下载 "content-disposition" 为内容的描述
        //用于在响应消息中向客户端传递附加信息,包括服务程序的名称,要求客户端进行认证的方式,请求的资源已移动到新地址等.
        //使用URLEncoder使之支持中文
        response.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode(filename,"UTF-8"));
        FileInputStream is=new FileInputStream(basePath+"/"+leftFileName);
  //      System.out.println(basePath+"/"+leftFileName);
        ServletOutputStream sos=response.getOutputStream();
        //缓冲区
        byte[]buffer=new byte[1024*1024*100];
        int len=0;
        //读到buff数组里
        while((len=is.read(buffer))!=-1){
            //读多少写多少
            sos.write(buffer,0,len);
        }
        sos.close();
        is.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
