package com.caotf.spring.aop.staticproxy;

public class TransImpl implements AOP {
   @Override
   public void before() {
      System.out.println("事务开始");
   }

   @Override
   public void after() {
      System.out.println("事务提交");
   }

   @Override
   public void exception() {
      System.out.println("事务回滚");
   }
}
