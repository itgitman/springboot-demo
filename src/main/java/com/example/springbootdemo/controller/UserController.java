package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lenovo
 * @Description:
 * @Date created at 7:29 2022/6/11
 * @Modified by lenovo
 **/
@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") Long id) {
        return new User(1L, "Alice", "123456");
    }
}
