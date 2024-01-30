package com.test.mapper;

import com.test.model.User;
import com.ws.base.mapper.BaseDataMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseDataMapper<User> {
}
