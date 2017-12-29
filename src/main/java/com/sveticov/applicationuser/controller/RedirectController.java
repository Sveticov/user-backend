package com.sveticov.applicationuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
    @GetMapping("/add_user")
    public String redirect1(){
        return "redirect:index.html";
    }

    @GetMapping("/show_all_users")
    public String redirect2(){
        return "redirect:index.html";
    }
}
