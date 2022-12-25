package com.justmore.storefront.searchstore.domain.application;

import com.justmore.storefront.searchstore.domain.Article;

public interface ArticleService {
  Article getArticleById(String id) throws Exception;

}
