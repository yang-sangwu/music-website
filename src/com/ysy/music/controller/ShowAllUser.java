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
import java.util.List;

@WebServlet(name = "ShowAllUser",value="/showAllUser")
public class ShowAllUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   /*     request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");*/
        UserService userService=new UserServiceImp();
        List<User>users=userService.showAllUser();
      //  System.out.println(users.toString());
  //      System.out.println("1111111");
        request.setAttribute("users",users);
 //       System.out.println(users+"666666666");
  //      System.out.println("1111122222 ");
        request.getRequestDispatcher("/user.jsp").forward(request,response);
//        response.setContentType("text/html;charset=UTF-8");
//        response.sendRedirect("/user.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
