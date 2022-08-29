package com.ysy.music.controller;

import com.ysy.music.entity.User;
import com.ysy.music.service.implem.UserService;
import com.ysy.music.service.implem.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BecomeVIP",value = "/becomeVIP")
public class BecomeVIP extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("恭喜你！成为VIP用户！");

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String nickname=request.getParameter("nickname");
        String password=request.getParameter("password");
        UserService userService=new UserServiceImp();
        User user=userService.sign(nickname,password);
        System.out.println(user+"666666");
        if(user!=null){
            UserService userService1=new UserServiceImp();
            User user1=new User(password,nickname);
            userService1.modifyTheVIP(user1);
            response.sendRedirect("loveVIP.jsp");
        }else{
            response.sendRedirect("vip.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
