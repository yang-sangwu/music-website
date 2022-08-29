package com.ysy.music.controller;

import com.ysy.music.entity.User;
import com.ysy.music.service.implem.UserService;
import com.ysy.music.service.implem.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyInformationVIP",value = "/modifyInformationVIP")
public class ModifyInformationVIP extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        System.out.println(nickname+"   "+password);
        if (!password.equals("")) {
            UserService userService = new UserServiceImp();
            User user = userService.sign(nickname, password);
          //  System.out.println(user+"11111111111");
            if (user != null) {
                request.setAttribute("user",user);
            //    System.out.println(user+"22222222222");
                request.getRequestDispatcher("modifyVIPNum.jsp").forward(request,response);
            } else {
                response.sendRedirect("modifyVIP.jsp");
            }
        }else {
            response.sendRedirect("modifyVIP.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
