package com.foshanxiaoyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloServlet extends HttpServlet {
    @Override
    protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1.获取前端参数
        String method = req.getParameter("method");
        if(method.equals("add")) { req.getSession().setAttribute("msg","执行了ADD方法");}
        if(method.equals("delete")) { req.getSession().setAttribute("msg","执行了DELETE方法");}

        // 2.调用业务层


        // 3.视图转发或重定向
        req.getRequestDispatcher("/WEB-INF/jsp/demo.jsp").forward(req,resp);

    }
}
