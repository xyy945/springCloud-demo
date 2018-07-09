package com.keywaysoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitIndexPage {

    @RequestMapping("/indexPage")
    public String visitIndexPage(){
        return "index";
    }
}
