package com.caotf.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")
public class BigDog extends Dog {
   @Value("大黑子")
   private String name;

   @Override
   public String toString() {
      return super.toString() + "BigDog{" + "name='" + name + '\'' + '}';
   }
}
