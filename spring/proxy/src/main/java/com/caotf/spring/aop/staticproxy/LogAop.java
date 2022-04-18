package com.caotf.spring.aop.staticproxy;

public class LogAop implements AOP {
   @Override
   public void before() {
      System.out.println("打log");
   }
}
