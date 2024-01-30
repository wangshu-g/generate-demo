package com.test.model;

import com.ws.annotation.Column;
import com.ws.annotation.Data;
import com.ws.annotation.JOIN;
import com.ws.base.model.BaseModel;
import com.ws.enu.Condition;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@lombok.Data
@Data(title = "文章标签", modelDefaultKeyword = "tagName")
public class ArticleTag extends BaseModel {

    @Column(title = "ID", conditions = {Condition.all}, primary = true)
    private String id;

    @Column(title = "创建时间", conditions = {Condition.all})
    private Date createdAt;

    @Column(title = "更新时间", conditions = {Condition.all})
    private Date updatedAt;

    @Column(title = "删除时间", conditions = {Condition.all})
    private Date deletedAt;

    @Column(title = "标签名称", conditions = {Condition.all}, keyword = true)
    private String tagName;

    @Column(title = "所属文章", conditions = {Condition.all})
    private String articleId;

    @JOIN(leftJoinField = "articleId")
    private Article article;

}
