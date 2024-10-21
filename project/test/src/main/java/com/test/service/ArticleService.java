package com.test.service;

import com.test.mapper.ArticleMapper;
import com.test.model.Article;
import com.wangshu.base.service.BaseDataService;
import java.lang.String;

public interface ArticleService extends BaseDataService<String, ArticleMapper, Article> {
}
