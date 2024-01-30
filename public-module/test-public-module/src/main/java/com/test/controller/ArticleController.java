package com.test.controller;

import com.test.model.Article;
import com.test.service.ArticleService;
import com.ws.base.controller.AbstractBaseDataControllerResultBody;
import jakarta.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(
    rollbackFor = {Exception.class}
)
@RestController
@RequestMapping("/Article")
public class ArticleController extends AbstractBaseDataControllerResultBody<ArticleService, Article> {
  @Resource
  public ArticleService articleService;

  @Override
  public ArticleService getService() {
    return articleService;
  }

  @Override
  public Article getModel() {
    return new Article();
  }
}
