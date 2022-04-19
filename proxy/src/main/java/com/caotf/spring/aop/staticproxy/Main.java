package com.caotf.spring.aop.staticproxy;

public class Main {
   public static void main(String[] args) {
      Service service = new ServiceProxy(new BuyBookService(), new TransImpl());
      service = new ServiceProxy(service, new LogAop());
      service.buy();
   }
}
