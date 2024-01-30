package com.test.mapper;

import com.test.model.Article;
import com.ws.base.mapper.BaseDataMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseDataMapper<Article> {
}
