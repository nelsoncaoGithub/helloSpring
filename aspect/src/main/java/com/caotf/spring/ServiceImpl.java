package com.caotf.spring;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {
   @Override
   public void doSomething() {
      System.out.println("搞事情");
   }
}
