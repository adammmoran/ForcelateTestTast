package com.example.demo.service;

import com.example.demo.entity.Article;

import java.util.List;

public interface ArticleService {
    Article save(Article article);
    List<Article> findAll();
}
