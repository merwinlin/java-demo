package com.merwin.bootdemo.controller;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redisson")
public class RedissonController {

    @Autowired
    private RedissonClient client;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/save")
    public String save(){
        stringRedisTemplate.opsForValue().set("key","redisson");
        return "save ok";
    }

    @GetMapping("/get")
    public String get(){
        return stringRedisTemplate.opsForValue().get("key");
    }

    @GetMapping("/lock")
    public String lock(){
        client.getRedLock();
        client.getLock("");
        return "";
    }

}
