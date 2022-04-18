package com.caotf.spring.dao.impl;

import com.caotf.spring.dao.UserDao;
import com.caotf.spring.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDoImpl implements UserDao {
   @Override
   public int insertUser(User users) {
      System.out.println("插入用户" + users);
      return 0;
   }
}
