package com.caotf.spring.proxy2;

public class SubBookServiceImpl extends BookServiceImpl{
   @Override
   public void buy() {
      try {
         System.out.println("开启事务");
         super.buy();
         System.out.println("失误提交");
      }
      catch(Exception ex) {
         System.out.println("事务回滚");
      }
   }
}
