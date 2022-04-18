package com.caotf.spring.aop.staticproxy;

public class ServiceProxy implements Service {
   private Service target;
   private AOP aop;

   public ServiceProxy(Service target, AOP aop) {
      this.target = target;
      this.aop = aop;
   }

   @Override
   public void buy() {
      try {
         aop.before();
         target.buy();
         aop.after();
      }
      catch(Exception ex) {
         aop.exception();
      }

   }
}
