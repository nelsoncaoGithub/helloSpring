package com.caotf.spring.pojo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class User {
   @Value("Nelson")
   private String name;
   @Value("26")
   private int age;
   @Autowired
   @Qualifier("dog1")
   private Dog dog;

   public User() {
   }

   public User(String name, int age, Dog dog) {
      this.name = name;
      this.age = age;
      this.dog = dog;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public Dog getDog() {
      return dog;
   }

   public void setDog(Dog dog) {
      this.dog = dog;
   }

   @Override
   public String toString() {
      return "User{" + "name='" + name + '\'' + ", age=" + age + ", dog=" + dog + '}';
   }
}
