package com.test.controller;

import com.ws.base.controller.AbstractBaseDataControllerResultBody;
import com.test.model.ArticleGroup;
import com.test.service.ArticleGroupService;
import jakarta.annotation.Resource;
import java.lang.Exception;
import java.lang.Override;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(
    rollbackFor = {Exception.class}
)
@RestController
@RequestMapping("/ArticleGroup")
public class ArticleGroupController extends AbstractBaseDataControllerResultBody<ArticleGroupService, ArticleGroup> {
  @Resource
  public ArticleGroupService articleGroupService;

  @Override
  public ArticleGroupService getService() {
    return articleGroupService;
  }

  @Override
  public ArticleGroup getModel() {
    return new ArticleGroup();
  }
}
