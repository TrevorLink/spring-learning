package com.niao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author HuangSir
 * @create 2021-07-03 14:30
 */
@Component
public class User {
@Value("Niao")
   private  String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "User{" +
              "name='" + name + '\'' +
              '}';
   }
}
