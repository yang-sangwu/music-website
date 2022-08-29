package com.ysy.music.controller;

import com.ysy.music.Dao.UserDao;
import com.ysy.music.Dao.UserDaoImp;
import com.ysy.music.entity.User;
import com.ysy.music.service.implem.UserService;
import com.ysy.music.service.implem.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyUserNum",value="/modifyUserNum")
public class ModifyUserNum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        Integer userId=Integer.valueOf(request.getParameter("userId"));
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        String nickname=request.getParameter("nickname");
        User user=new User(userId,account,password,nickname);
        UserService userService=new UserServiceImp();
        userService.modifyUser(user);
     //   System.out.println(user+"我是");
        response.sendRedirect(request.getContextPath()+"/jump.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
