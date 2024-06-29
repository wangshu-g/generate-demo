package com.test.mapper;

import com.ws.base.mapper.BaseDataMapper;
import com.test.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseDataMapper<User> {
}
