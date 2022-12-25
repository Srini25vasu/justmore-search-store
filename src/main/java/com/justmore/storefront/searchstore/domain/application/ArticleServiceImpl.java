package com.justmore.storefront.searchstore.domain.application;

import com.justmore.storefront.searchstore.domain.Article;
import com.justmore.storefront.searchstore.repositories.ArticleRepository;
import com.justmore.storefront.searchstore.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  ArticleRepository articleRepository;

  public Article getArticleById(String id) throws Exception {
    return Mapper.mapToDomain(articleRepository.findById(id).orElseThrow(() -> new Exception("No data")));
  }
}
