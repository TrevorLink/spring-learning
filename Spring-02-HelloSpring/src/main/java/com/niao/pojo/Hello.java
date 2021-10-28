package com.niao.pojo;
/**
 * @author HuangSir
 * @create 2021-06-21 9:20
 */
public class Hello {
   private  String str;

   public String getStr() {
      return str;
   }

   public void setStr(String str) {
      this.str = str;
   }

   @Override
   public String toString() {
      return "Hello{" +
              "str='" + str + '\'' +
              '}';
   }
}
