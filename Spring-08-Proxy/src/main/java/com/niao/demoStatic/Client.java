package com.niao.demoStatic;

/**
 * @author HuangSir
 * @create 2021-07-03 19:23
 */
public class Client {
   public static void main(String[] args) {
      //用户在房产中介那里挑选出他们满意的户型，这个户型的房东要出租房子
      HouseHold houseHold  = new HouseHold();
      //通过户型关联对应的房产中介，中介来帮房东租房子
      Proxy proxy = new Proxy(houseHold);
      //用户不认识房东，直接找房产中介执行出租
      proxy.rent();
   }
}
