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

@WebServlet(name = "ModifyUser",value="/modifyUser")
public class ModifyUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Integer userId=Integer.valueOf(request.getParameter("userId"));
        UserService userService=new UserServiceImp();
        User user=userService.selectOneUser(userId);

     //   System.out.println(user+"1234561");

        request.setAttribute("user",user);
        request.getRequestDispatcher("/modifyUser.jsp").forward(request,response);

  /*      String account=request.getParameter("account");
        String password=request.getParameter("password");
        String nickname=request.getParameter("nickname");
        */
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
