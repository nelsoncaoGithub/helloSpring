package com.caotf.spring.aop.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyUtil {
   public static <T> T getProxy(T target, AOP aop) {
      return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
         target.getClass().getInterfaces(), (proxy, method, args) -> {
            Object result = null;

             try {
                aop.before();
                result = method.invoke(target);
                aop.after();

                return result;
             }
             catch(Exception e) {
                aop.exception();
             }
             finally {
                return result;
             }
         });

   }
}
