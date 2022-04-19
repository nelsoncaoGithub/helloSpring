package com.caotf.spring.proxy1;

public class BookServiceImpl {
   public void buy() {
      try {
         System.out.println("业务员开始");
         System.out.println("买的过程");
         System.out.println("业务结束");
      }
      catch(Exception ex) {
         System.out.println("回滚");
      }
   }
}
