package com.chrisgya.beerinventoryservice.repository;

import com.chrisgya.beerinventoryservice.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}