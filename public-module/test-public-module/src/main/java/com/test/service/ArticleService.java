package com.test.service;

import com.test.mapper.ArticleMapper;
import com.test.model.Article;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
    rollbackFor = Exception.class
)
public class ArticleService extends AbstractBaseDataService<ArticleMapper, Article> {
  @Resource
  public ArticleMapper articleMapper;

  @Override
  public ArticleMapper getMapper() {
    return articleMapper;
  }
}
