package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User findById(Long id) {
        return new User(1L, "Alice", "123456");
    }
}
