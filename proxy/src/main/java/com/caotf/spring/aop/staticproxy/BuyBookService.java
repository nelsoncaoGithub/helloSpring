package com.caotf.spring.aop.staticproxy;

public class BuyBookService implements Service {
   @Override
   public void buy() {
      System.out.println("买书了");
   }
}
