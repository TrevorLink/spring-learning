package com.niao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author HuangSir
 * @create 2021-07-03 10:57
 */
@Component
@Scope("singleton")
public class User {
   @Value("niao")
   public  String name="van";

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
