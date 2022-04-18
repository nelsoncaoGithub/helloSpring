package com.caotf.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
   @Test
   public void student() {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
      System.out.println(context.getBean("student"));
   }
}
