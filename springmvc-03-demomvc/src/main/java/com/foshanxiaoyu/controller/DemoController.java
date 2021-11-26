package com.foshanxiaoyu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        // 封装对象，放在 mv 中
       mv.addObject("msg","DemoHelloSpringMVC");
       // 封装展示视图
        mv.setViewName("demo"); // /WEB-INF/jsp/demo.jsp
        return mv;
    }
}


//@org.springframework.stereotype.Controller
//@RequestMapping("/DemoController")
//public class DemoController {
//
//    @RequestMapping("/demo")
//    public String showDemo(Model model){
//        model.addAttribute("msg","demo showtime");
//        return "demo";
//    }
//
//}