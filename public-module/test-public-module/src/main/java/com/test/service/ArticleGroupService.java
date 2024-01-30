package com.test.service;

import com.test.mapper.ArticleGroupMapper;
import com.test.model.ArticleGroup;
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
public class ArticleGroupService extends AbstractBaseDataService<ArticleGroupMapper, ArticleGroup> {
  @Resource
  public ArticleGroupMapper articleGroupMapper;

  @Override
  public ArticleGroupMapper getMapper() {
    return articleGroupMapper;
  }
}
