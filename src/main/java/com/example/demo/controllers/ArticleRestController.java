package com.example.demo.controllers;

import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleRestController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/api/articles")
    public List<Article> allArticles(){
        return articleService.findAll();
    }

    @PostMapping("/api/articles")
    Article createArticle(@RequestBody Article article){
        return articleService.save(article);
    }
}
