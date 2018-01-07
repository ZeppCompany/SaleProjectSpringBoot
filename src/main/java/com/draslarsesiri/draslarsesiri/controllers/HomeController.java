package com.draslarsesiri.draslarsesiri.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home/index";
    }

    @RequestMapping("/about")
    public String about(){
        return "home/about";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "home/blog";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "home/contact";
    }
}
