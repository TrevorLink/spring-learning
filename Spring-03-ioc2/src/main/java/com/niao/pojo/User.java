package com.niao.pojo;

/**
 * @author HuangSir
 * @create 2021-07-01 20:21
 */
public class User {
   private  String name;

   public User(String name) {
      this.name=name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public  void show(){
      System.out.println("name="+name);
   }
}
