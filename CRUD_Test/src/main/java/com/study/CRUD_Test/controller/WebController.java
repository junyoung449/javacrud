package com.study.CRUD_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "junyoung");
        model.addAttribute("img", "image/img.jpg");
        return "hello";

    }
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }

}


