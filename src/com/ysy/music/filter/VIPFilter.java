package com.ysy.music.filter;

import com.ysy.music.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "VIPFilter",value = "/musicVIP.jsp")
public class VIPFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;
        HttpSession session=request.getSession();
        User user=(User)session.getAttribute("user");
        if(user!=null){
            chain.doFilter(req, resp);
        }else{
            response.sendRedirect(request.getContextPath()+"/sign.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
/*
* //验证是否是用户登录
        //向下转型/拆箱 因为ServletRequest和ServletResponse属于父类，所以需要向下转型 转换成为HTTP型的
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;
        HttpSession session=request.getSession();
        Manager mgr=(Manager)session.getAttribute("manager") ;
        if(mgr!=null){
            chain.doFilter(req, resp);
        }else{
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
    }*/