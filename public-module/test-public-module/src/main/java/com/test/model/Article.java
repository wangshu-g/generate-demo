package com.test.model;

import com.ws.annotation.Column;
import com.ws.annotation.Data;
import com.ws.annotation.JOIN;
import com.ws.base.model.BaseModel;
import com.ws.enu.Condition;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@lombok.Data
@Data(title = "文章", modelDefaultKeyword = "title")
public class Article extends BaseModel {

    @Column(title = "ID", conditions = {Condition.all}, primary = true)
    private String id;

    @Column(title = "创建时间", conditions = {Condition.all})
    private Date createdAt;

    @Column(title = "更新时间", conditions = {Condition.all})
    private Date updatedAt;

    @Column(title = "删除时间", conditions = {Condition.all})
    private Date deletedAt;

    @Column(conditions = {Condition.all}, title = "文章标题", keyword = true)
    private String title;

    @Column(conditions = {Condition.all}, title = "描述", keyword = true)
    private String desc;

    @Column(conditions = {Condition.all}, title = "文章详情", jdbcType = "longtext")
    private String detail;

    @Column(conditions = {Condition.all}, title = "状态")
    private String status;

    @Column(conditions = {Condition.all}, title = "发布者")
    private String uid;

    @JOIN(rightJoinField = "uid")
    private User user;

    @Column(conditions = {Condition.all}, title = "文章所属分组")
    private String groupId;

    /**
     * <p>
     * 正常的一对一场景
     * </p>
     **/
    @JOIN(rightJoinField = "groupId")
    private ArticleGroup articleGroup;

    /**
     * <p>
     * 少量一对多场景可以使用这种关联定义,过多时不建议使用
     * </p>
     * <p>
     * getList 会忽略此类关联定义
     * </p>
     **/
    @JOIN(leftJoinField = "articleId")
    private List<ArticleTag> articleTagList;

}
