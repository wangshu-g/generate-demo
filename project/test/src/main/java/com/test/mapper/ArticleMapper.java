package com.test.mapper;

import com.ws.base.mapper.BaseDataMapper;
import com.test.model.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseDataMapper<Article> {
}
