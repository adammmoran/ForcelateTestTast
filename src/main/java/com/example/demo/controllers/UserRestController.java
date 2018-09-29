package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public List<User> allUsers(){
        return userService.findAll();
    }

    @GetMapping("/api/users/age/{age}")
    public List<User> allUsersByAge(@PathVariable("age")int age){
        return userService.findUsersByAgeGreaterThan(age);
    }

    @GetMapping("/api/users/article_color/{color}")
    public List<User> allUsersByArticleColor(@PathVariable("color")String color){

        return userService.findUsersByArticleColorIs(color);
    }

    @GetMapping("/api/users/articles/{number}")
    public List<String> findUsersByArticleIsGreaterThan(@PathVariable("number")int number){
        return userService.findUsersByArticleIsGreaterThan(number);
    }

    @PostMapping("/api/users")
    User createUser(@RequestBody User user){
        return userService.save(user);
    }
}
