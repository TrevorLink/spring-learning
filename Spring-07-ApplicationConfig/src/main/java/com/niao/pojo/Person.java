package com.niao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author HuangSir
 * @create 2021-07-03 15:04
 */
@Component
public class Person {
   @Value("18")
   private  int age;

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Person{" +
              "age=" + age +
              '}';
   }
}
