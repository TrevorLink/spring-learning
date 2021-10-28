package com.niao.pojo;

/**
 * @author HuangSir
 * @create 2021-07-02 9:05
 */
public class Address {
   private  String address;

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "Address{" +
              "address='" + address + '\'' +
              '}';
   }
}
