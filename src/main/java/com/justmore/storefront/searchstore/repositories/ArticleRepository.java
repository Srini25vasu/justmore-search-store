package com.justmore.storefront.searchstore.repositories;

import com.justmore.storefront.searchstore.repositories.entities.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article,String> {
}
