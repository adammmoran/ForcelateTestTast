package com.example.demo.service.impl;

import com.example.demo.dao.ArticleDAO;
import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtricleServiceImpl implements ArticleService {
    @Autowired
    ArticleDAO articleDAO;

    @Override
    public Article save(Article article) {
        return articleDAO.save(article);
    }

    @Override
    public List<Article> findAll() {
        return (List<Article>) articleDAO.findAll();
    }
}
