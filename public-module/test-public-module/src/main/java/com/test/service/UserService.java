package com.test.service;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.ws.base.service.AbstractBaseDataService;
import jakarta.annotation.Resource;
import java.lang.Exception;
import java.lang.Override;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
    rollbackFor = Exception.class
)
public class UserService extends AbstractBaseDataService<UserMapper, User> {
  @Resource
  public UserMapper userMapper;

  @Override
  public UserMapper getMapper() {
    return userMapper;
  }
}
