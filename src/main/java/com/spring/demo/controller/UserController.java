package com.spring.demo.controller;


import com.spring.demo.vo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
