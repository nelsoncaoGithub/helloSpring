package com.caotf.spring.service;

import com.caotf.spring.dao.UserDao;
import com.caotf.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
   private UserDao userDao;

   public int insertUser(User user) {
      return this.userDao.insertUser(user);
   }
}
