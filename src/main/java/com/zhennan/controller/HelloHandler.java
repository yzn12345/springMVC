package com.zhennan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @RequestMapping("/index")
    public String index(){
        System.out.println("执行了Index");
        return "index";
    }
}
