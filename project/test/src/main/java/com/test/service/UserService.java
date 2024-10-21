package com.test.service;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.wangshu.base.service.BaseDataService;
import java.lang.String;

public interface UserService extends BaseDataService<String, UserMapper, User> {
}
