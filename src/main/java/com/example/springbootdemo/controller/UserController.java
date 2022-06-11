package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable("id") Long id) {
    }

    @GetMapping("/users")
    public List<User> findAll(@RequestParam("user") User user){
        return null;
    }

    @GetMapping("/users?name={name}")
    public User findByName(@RequestParam(value = "name",required = true) String name) {
        return null;
    }
}
