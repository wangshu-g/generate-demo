package com.test.service;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Override;
import java.lang.String;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractBaseDataService<String, UserMapper, User> {
  @Resource
  public UserMapper userMapper;

  @Override
  public UserMapper getMapper() {
    return userMapper;
  }
}
