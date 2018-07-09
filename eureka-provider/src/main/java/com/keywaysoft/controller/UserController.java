package com.keywaysoft.controller;

import com.keywaysoft.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/user")
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"cwj1",18));
        list.add(new User(2,"cwj2",22));
        list.add(new User(3,"cwj3",20));
        return list;
    }

}
