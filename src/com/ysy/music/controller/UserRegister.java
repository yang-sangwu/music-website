package com.ysy.music.controller;

import com.ysy.music.entity.User;
import com.ysy.music.service.implem.UserService;
import com.ysy.music.service.implem.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserRegister",value="/userRegister")
public class UserRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  //      System.out.println("登录成功！");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String nickname=request.getParameter("nickname");
        String password=request.getParameter("password");
   /*     if(!password.equals("")) {*/
        //    System.out.println(nickname + "   " + password);
            UserService userService = new UserServiceImp();
            User user = userService.sign(nickname, password);
            System.out.println(user + "67676767");
            if (user != null) {
                int user1=user.getGrade();
                System.out.println(user1+"这是VIP用户");
                if(user1==0) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    //  System.out.println(user + "34343434343");
                    request.getRequestDispatcher("/showAllMusic").forward(request, response);
                }
                else{
                    request.setAttribute("user",user);
                    request.getRequestDispatcher("musicVIP.jsp").forward(request,response);
                }
            }else {
                response.sendRedirect("/WebMusic/sign.jsp");
            }
    /*    }
        else {
            response.sendRedirect("/WebMusic/sign.jsp");
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}