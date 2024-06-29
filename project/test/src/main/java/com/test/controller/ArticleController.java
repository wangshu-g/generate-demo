package com.test.controller;

import com.ws.base.controller.AbstractBaseDataControllerResultTableBody;
import com.test.model.Article;
import com.test.service.ArticleService;
import jakarta.annotation.Resource;
import java.lang.Override;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Article")
public class ArticleController extends AbstractBaseDataControllerResultTableBody<ArticleService, Article> {
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
