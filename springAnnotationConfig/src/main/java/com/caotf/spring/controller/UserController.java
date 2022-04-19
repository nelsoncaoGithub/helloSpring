package com.caotf.spring.controller;

import com.caotf.spring.pojo.User;
import com.caotf.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
   @Autowired
   private UserService userService;

   public int insertUser(User user) {
      return this.userService.insertUser(user);
   }
}
