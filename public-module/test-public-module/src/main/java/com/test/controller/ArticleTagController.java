package com.test.controller;

import com.test.model.ArticleTag;
import com.test.service.ArticleTagService;
import com.ws.base.controller.AbstractBaseDataControllerResultBody;
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
@RequestMapping("/ArticleTag")
public class ArticleTagController extends AbstractBaseDataControllerResultBody<ArticleTagService, ArticleTag> {
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
