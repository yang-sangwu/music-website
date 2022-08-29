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

@WebServlet(name = "DeleteUser",value = "/deleteUser")
public class DeleteUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   //     String username=request.getParameter("username");
//        Integer id=Integer.valueOf(request.getParameter("userId"));
        String req=request.getParameter("userId");
        Integer userId=Integer.valueOf(req);

        UserService userService=new UserServiceImp();
        List<User> userList1=userService.showAllUser();
        userService.deleteUser(userId);
        List<User> userList=userService.showAllUser();
        response.sendRedirect(request.getContextPath()+"/showAllUser");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
