package com.ysy.music.controller;

import com.ysy.music.entity.Manager;
import com.ysy.music.service.implem.ManagerSerImp;
import com.ysy.music.service.implem.ManagerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//redeploy 重新部署
@WebServlet(name = "ManagerDaoServlet",value="/ManagerUser")
public class ManagerDaoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");  //收参
     //   System.out.println(username+"   "+password);
        ManagerService managerService=new ManagerSerImp();
        Manager manager=managerService.login(username,password);        //调用业务逻辑 判断管理员是否与数据库中的一样
     //   System.out.println(manager);
        if(manager!=null){

            HttpSession session=request.getSession();
            session.setAttribute("manager",manager);

         // response.sendRedirect("/showAllUser");
            request.getRequestDispatcher("/showAllUser").forward(request,response);
        }
        else {
            response.sendRedirect("/WebMusic/login.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
