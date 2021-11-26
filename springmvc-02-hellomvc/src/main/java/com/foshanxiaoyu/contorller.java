package com.foshanxiaoyu;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller; // 接口

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 这里先导  Controller接口
public class contorller implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse resp) throws Exception{

        // ModelAndView
        ModelAndView mv = new ModelAndView();
        // 调用业务层

        // 封装对象，放在mv 中
        mv.addObject("msg","HelloSpringMVC 02 调用成功");
        // 封装要跳转的视图，放在mv 中
        mv.setViewName("hello"); // "/WEB-INF/jsp/hello.jsp"
        return mv;
    }
}
