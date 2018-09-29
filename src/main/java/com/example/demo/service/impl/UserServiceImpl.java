package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Article;
import com.example.demo.entity.Color;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userDAO.findAll();
    }


    @Override
    public List<User> findUsersByAgeGreaterThan(int age) {
        return userDAO.findUsersByAgeGreaterThan(age);
    }

    @Override
    public List<User> findUsersByArticleColorIs(String color) {
        Iterable<User> users = userDAO.findAll();
        List<User> newLUsers= new ArrayList<>();
        for (User user : users) {
            List<Article> articles = user.getArticle();
            for (Article article : articles) {
                if(article.getColor().name().equals(color)){
                    newLUsers.add(user);
                    break;
                }
            }
        }
        return newLUsers;
    }


    @Override
    public List<String> findUsersByArticleIsGreaterThan(int number) {
        List<User> users = (List<User>) userDAO.findAll();
        List<String> st= new ArrayList<>();
        for (User user : users) {
            if(user.getArticle().size()>=number)
                st.add(user.getName());
        }
        return st;
    }


}
