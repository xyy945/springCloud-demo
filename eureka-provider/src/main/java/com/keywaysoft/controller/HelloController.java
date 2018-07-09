package com.keywaysoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private int port;

    @Value("${cwj.user}")
    String cwjUser;
    @Value("${cwj.password}")
    String cwjPassword;


    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口："+port;
    }


    @RequestMapping("/helloCon")
    public String showUserAndPassword(){
        String sb = "username is " + cwjUser + "," + "password is " +cwjPassword;
        return sb;
    }

}