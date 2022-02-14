package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public  String viewHomePage(){
        return "html/index";
    }

    @PostMapping("/message")
    public  String sendMessageWindow(){
        return "html/messageWindow";
    }
}
