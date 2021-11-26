package com.foshanxiaoyu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class DemoController {
    // 页面访问地址是   /help/demo
    @RequestMapping("/demo")
    public String showTime(Model model){

        model.addAttribute("msg","demo, 呵呵springMVC");

        return "demo";
    }
}
