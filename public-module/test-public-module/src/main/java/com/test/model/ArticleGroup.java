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
@Data(title = "文章分组", modelDefaultKeyword = "groupName")
public class ArticleGroup extends BaseModel {

    @Column(title = "ID", conditions = {Condition.all}, primary = true)
    private String id;

    @Column(title = "创建时间", conditions = {Condition.all})
    private Date createdAt;

    @Column(title = "更新时间", conditions = {Condition.all})
    private Date updatedAt;

    @Column(title = "删除时间", conditions = {Condition.all})
    private Date deletedAt;

    @Column(conditions = {Condition.all}, title = "分组名称", comment = "分组名称", keyword = true)
    private String groupName;

    @Column(conditions = {Condition.all}, title = "描述", comment = "描述", keyword = true)
    private String desc;

    @Column(conditions = {Condition.all}, title = "创建者", comment = "创建者")
    private String uid;

    @JOIN(rightJoinField = "uid")
    private User user;

}
