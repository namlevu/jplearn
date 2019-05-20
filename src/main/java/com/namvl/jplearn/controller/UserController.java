package com.namvl.jplearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController
 */
@Controller
public class UserController {

  /**
   * Show all user
   * @param model
   * @return
   */
  @RequestMapping("/users")
  public String users(Model model) {
    return "users";
  }

  @RequestMapping("/addUser")
  public String addUser() {
    return "addUser";
  }

  @RequestMapping("/addUserResult")
  public String addUserResult() {
    return "addUserResult";
  }
}