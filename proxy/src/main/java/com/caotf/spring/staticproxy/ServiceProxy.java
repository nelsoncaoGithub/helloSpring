package com.caotf.spring.staticproxy;

public class ServiceProxy implements Service {
   private Service tatget;

   public ServiceProxy(Service service) {
      this.tatget = service;
   }

   @Override
   public void buy() {
      try {
         System.out.println("事务开始");
         tatget.buy();
         System.out.println("事务提交");
      }
      catch(Exception e) {
         System.out.println("事务回滚");
      }

   }
}
