package com.merwin.bootdemo.controller;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debug")
public class DebugController {

    @Autowired
    RedissonClient redissonClient;

    @RequestMapping("/test")
    public String test(){

        return "123";
    }

}
