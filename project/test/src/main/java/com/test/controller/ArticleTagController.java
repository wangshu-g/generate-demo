package com.test.controller;

import com.wangshu.base.controller.AbstractBaseDataControllerResultTableBody;
import com.test.model.ArticleTag;
import com.test.service.ArticleTagService;
import jakarta.annotation.Resource;
import java.lang.Override;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ArticleTag")
public class ArticleTagController extends AbstractBaseDataControllerResultTableBody<ArticleTagService, ArticleTag> {
  @Resource
  public ArticleTagService articleTagService;

  @Override
  public ArticleTagService getService() {
    return articleTagService;
  }

  @Override
  public ArticleTag getModel() {
    return new ArticleTag();
  }
}
