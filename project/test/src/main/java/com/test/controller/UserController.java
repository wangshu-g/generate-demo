package com.test.controller;

import com.ws.base.controller.AbstractBaseDataControllerResultTableBody;
import com.test.model.User;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import java.lang.Override;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController extends AbstractBaseDataControllerResultTableBody<UserService, User> {
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
