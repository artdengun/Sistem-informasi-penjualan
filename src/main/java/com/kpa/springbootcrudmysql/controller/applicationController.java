package com.kpa.springbootcrudmysql.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class applicationController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

//    @GetMapping("/laporanPembelian")
//    public String getLaporanPembelian(){
//        return "laporanPembelian";
//    }

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
