package com.namvl.jplearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController
 */
@Controller
public class UserController {
  @RequestMapping("/users")
  public String allUsers(Model model) {
    return "userlist";
  }
}