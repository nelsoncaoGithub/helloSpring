package com.caotf.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
   @Before(value = "execution(* com.caotf.spring.*.*(..))")
   public void before(JoinPoint joinPoint) {
      System.out.println("前置通知");
   }

   @Around("execution(* com.caotf..*.*(..))")
   public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
      System.out.println("环绕前置通知");
      Object o = joinPoint.proceed();
      System.out.println("环绕后置通知");

      return o;
   }

   @AfterReturning("execution(* com..*.*(..))")
   public void afterRetuning(JoinPoint joinPoint) {
      System.out.println("后置通知");
   }

   @After("execution(* com..*.*(..))")
   public void after() {
      System.out.println("最终通知");
   }

   @AfterThrowing("execution(* com..*.*(..))")
   public void afterThrow() {
      System.out.println("异常通知");
   }
}
