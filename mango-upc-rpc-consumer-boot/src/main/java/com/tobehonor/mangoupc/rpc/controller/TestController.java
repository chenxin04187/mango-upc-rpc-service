package com.tobehonor.mangoupc.rpc.controller;

import com.tobehonor.mangoupc.rpc.user.consumer.UserServiceConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    
    @Resource
    private UserServiceConsumer userServiceConsumer;
    
    @GetMapping("/test")
    public String sayHello() {
        return userServiceConsumer.sayHello();
    }
    
}
