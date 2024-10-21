package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.wangshu.base.service.AbstractBaseDataService;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractBaseDataService<String, UserMapper, User> implements UserService {
  @Resource
  public UserMapper userMapper;

  @Override
  public UserMapper getMapper() {
    return userMapper;
  }
}
