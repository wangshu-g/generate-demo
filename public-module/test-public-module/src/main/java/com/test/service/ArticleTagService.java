package com.test.service;

import com.test.mapper.ArticleTagMapper;
import com.test.model.ArticleTag;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Exception;
import java.lang.Override;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
    rollbackFor = Exception.class
)
public class ArticleTagService extends AbstractBaseDataService<ArticleTagMapper, ArticleTag> {
  @Resource
  public ArticleTagMapper articleTagMapper;

  @Override
  public ArticleTagMapper getMapper() {
    return articleTagMapper;
  }
}
