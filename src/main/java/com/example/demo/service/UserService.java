package com.example.demo.service;

import com.example.demo.entity.Color;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    List<User> findUsersByAgeGreaterThan(int age);
    List<User> findUsersByArticleColorIs(String color);
    List<String> findUsersByArticleIsGreaterThan(int number);
}
