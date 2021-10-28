package com.niao.pojo;

/**
 * @author HuangSir
 * @create 2021-07-01 21:31
 */
public class UserPro {
   private  String name;

   public UserPro() {
      System.out.println("UserPro的空参");
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
