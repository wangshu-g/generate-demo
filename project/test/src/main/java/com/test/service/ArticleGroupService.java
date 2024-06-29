package com.test.service;

import com.test.mapper.ArticleGroupMapper;
import com.test.model.ArticleGroup;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleGroupService extends AbstractBaseDataService<String, ArticleGroupMapper, ArticleGroup> {
  @Resource
  public ArticleGroupMapper articleGroupMapper;

  @Override
  public ArticleGroupMapper getMapper() {
    return articleGroupMapper;
  }
}
