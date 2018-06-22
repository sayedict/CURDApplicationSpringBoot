package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
