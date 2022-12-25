package com.justmore.storefront.searchstore.utils;

import com.justmore.storefront.searchstore.domain.Article;

public  class  Mapper {
  public static Article mapToDomain(final com.justmore.storefront.searchstore.repositories.entities.Article article){
    Article articleDomain = new Article();
    articleDomain.setId(article.getId());
    articleDomain.setTitle(article.getTitle());
    articleDomain.setAuthors(article.getAuthors());
    return articleDomain;
  }

}
