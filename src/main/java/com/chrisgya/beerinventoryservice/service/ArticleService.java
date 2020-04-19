package com.chrisgya.beerinventoryservice.service;

import com.chrisgya.beerinventoryservice.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    Article addArticle(Article article);
    Article updateArticle(Article article);
    void deleteArticle(long articleId);
}