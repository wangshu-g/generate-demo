package com.test.service.impl;

import com.test.mapper.ArticleMapper;
import com.test.model.Article;
import com.wangshu.base.service.AbstractBaseDataService;
import com.test.service.ArticleService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends AbstractBaseDataService<String, ArticleMapper, Article> implements ArticleService {
  @Resource
  public ArticleMapper articleMapper;

  @Override
  public ArticleMapper getMapper() {
    return articleMapper;
  }
}
