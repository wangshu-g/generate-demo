package com.test.service.impl;

import com.test.mapper.ArticleGroupMapper;
import com.test.model.ArticleGroup;
import com.wangshu.base.service.AbstractBaseDataService;
import com.test.service.ArticleGroupService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class ArticleGroupServiceImpl extends AbstractBaseDataService<String, ArticleGroupMapper, ArticleGroup> implements ArticleGroupService {
  @Resource
  public ArticleGroupMapper articleGroupMapper;

  @Override
  public ArticleGroupMapper getMapper() {
    return articleGroupMapper;
  }
}
