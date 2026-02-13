package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}