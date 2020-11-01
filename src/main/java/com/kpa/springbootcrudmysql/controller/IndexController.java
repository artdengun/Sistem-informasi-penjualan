package com.kpa.springbootcrudmysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }


    @GetMapping("/logout")
    public String getLogout(){
        return "login";
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }


    @GetMapping("/empty")
    public String getEmpty(){
        return "empty";
    }

    @GetMapping("/chart")
    public String getChart(){
        return "chart";
    }


    @GetMapping("/form")
    public String getForm(){
        return "form";
    }


    @GetMapping("/tab")
    public String getTab(){
        return "tab-panel";
    }

    @GetMapping("/table")
    public String getTable(){
        return "table";
    }

    @GetMapping("/ui")
    public String getUI(){
        return "ui-elements";
    }

}
