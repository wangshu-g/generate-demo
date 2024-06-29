package com.test.service;

import com.test.mapper.ArticleMapper;
import com.test.model.Article;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleService extends AbstractBaseDataService<String, ArticleMapper, Article> {
  @Resource
  public ArticleMapper articleMapper;

  @Override
  public ArticleMapper getMapper() {
    return articleMapper;
  }
}
