package com.keywaysoft.controller;

import com.keywaysoft.pojo.User;
import com.keywaysoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/consumer")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }
}

