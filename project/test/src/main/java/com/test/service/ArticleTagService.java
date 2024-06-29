package com.test.service;

import com.test.mapper.ArticleTagMapper;
import com.test.model.ArticleTag;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleTagService extends AbstractBaseDataService<String, ArticleTagMapper, ArticleTag> {
  @Resource
  public ArticleTagMapper articleTagMapper;

  @Override
  public ArticleTagMapper getMapper() {
    return articleTagMapper;
  }
}
