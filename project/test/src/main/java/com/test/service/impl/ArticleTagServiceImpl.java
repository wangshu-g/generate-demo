package com.test.service.impl;

import com.test.mapper.ArticleTagMapper;
import com.test.model.ArticleTag;
import com.wangshu.base.service.AbstractBaseDataService;
import com.test.service.ArticleTagService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleTagServiceImpl extends AbstractBaseDataService<String, ArticleTagMapper, ArticleTag> implements ArticleTagService {
  @Resource
  public ArticleTagMapper articleTagMapper;

  @Override
  public ArticleTagMapper getMapper() {
    return articleTagMapper;
  }
}
