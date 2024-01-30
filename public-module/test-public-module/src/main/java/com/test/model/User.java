package com.test.model;

import com.ws.annotation.Column;
import com.ws.annotation.Data;
import com.ws.base.model.BaseModel;
import com.ws.enu.Condition;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@lombok.Data
@Data(title = "用户", modelDefaultKeyword = "name")
public class User extends BaseModel {

    @Column(title = "ID", conditions = {Condition.all}, primary = true)
    private String id;

    @Column(title = "创建时间", conditions = {Condition.all})
    private Date createdAt;

    @Column(title = "更新时间", conditions = {Condition.all})
    private Date updatedAt;

    @Column(title = "删除时间", conditions = {Condition.all})
    private Date deletedAt;

    @Column(conditions = {Condition.all}, title = "昵称", comment = "昵称", keyword = true)
    private String name;

    @Column(conditions = {Condition.all}, title = "自述", comment = "自述", keyword = true)
    private String readMe;

}
