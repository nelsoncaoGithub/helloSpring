package com.caotf.spring.aop.staticproxy;

public interface AOP {
   default void before() {}
   default void after() {}
   default void exception() {}
}
