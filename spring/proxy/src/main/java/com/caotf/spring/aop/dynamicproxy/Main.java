package com.caotf.spring.aop.dynamicproxy;

public class Main {
   public static void main(String[] args) {
      Service service = ProxyUtil.getProxy(new ServiceImpl(), new TransImpl());
      service.buy();
   }
}
