package com.test.controller;

import com.wangshu.base.controller.AbstractBaseDataControllerResultTableBody;
import com.test.model.ArticleGroup;
import com.test.service.ArticleGroupService;
import jakarta.annotation.Resource;
import java.lang.Override;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ArticleGroup")
public class ArticleGroupController extends AbstractBaseDataControllerResultTableBody<ArticleGroupService, ArticleGroup> {
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
