package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.Article;

public interface ArticleInterface  extends JpaRepository<Article,Integer>{

}
