package com.caotf.spring.staticproxy;

public class ServiceImpl implements Service {
   @Override
   public void buy() {
      System.out.println("开始购买");
   }
}
