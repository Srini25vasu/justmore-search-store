package com.justmore.storefront.searchstore.domain;

import com.justmore.storefront.searchstore.repositories.entities.Author;
import lombok.Data;


import java.util.List;

@Data
public class Article {
  String id;
  String title;
  List<Author> authors;
}
