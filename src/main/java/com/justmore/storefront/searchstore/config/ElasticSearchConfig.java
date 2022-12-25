package com.justmore.storefront.searchstore.config;


import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.justmore.storefront.searchstore.repositories")
@ComponentScan(basePackages = { " com.justmore.storefront.searchstore.domain.application" })
public class ElasticSearchConfig {
  @Bean
  public RestClient client() {
    return RestClient.builder(
          new HttpHost("localhost", 9200)
    ).build();
  }

 /* @Bean
  public ElasticsearchOperations elasticsearchTemplate() {
    return new ElasticsearchRestTemplate(client());
  }
  */

}
