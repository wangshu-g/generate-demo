package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import com.ws.base.controller.AbstractBaseDataControllerResultBody;
import jakarta.annotation.Resource;
import java.lang.Exception;
import java.lang.Override;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(
    rollbackFor = {Exception.class}
)
@RestController
@RequestMapping("/User")
public class UserController extends AbstractBaseDataControllerResultBody<UserService, User> {
  @Resource
  public UserService userService;

  @Override
  public UserService getService() {
    return userService;
  }

  @Override
  public User getModel() {
    return new User();
  }
}
