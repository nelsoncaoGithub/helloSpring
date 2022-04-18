package com.caotf.spring.aop.dynamicproxy;

public class ServiceImpl implements Service {
   @Override
   public void buy() {
      System.out.println("买了");
   }
}
