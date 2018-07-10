package com.keywaysoft.service;

import com.keywaysoft.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private LoadBalancerClient loadBalancerClient;//ribbon负载均衡器

    public List<User> getUsers() {
        List<User> list=new ArrayList<>();
        return list;
    }
}