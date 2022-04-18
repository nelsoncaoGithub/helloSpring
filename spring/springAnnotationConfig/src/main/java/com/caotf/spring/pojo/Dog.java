package com.caotf.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog1")
public class Dog {
   @Value("黑子")
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Dog{" + "name='" + name + '\'' + '}';
   }
}
