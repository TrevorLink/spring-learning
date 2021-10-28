package com.niao.demoStatic;

/**
 * @author HuangSir
 * @create 2021-07-03 19:21
 */
public class Proxy implements Rent{
   //可以李姐为是一个房产中介有多个房源，有众多房东们
   HouseHold houseHold ;

   //在静态代理中一个房产中介只对应一个房东
   public Proxy(HouseHold houseHold) {
      this.houseHold = houseHold;
   }

   @Override
   public void rent() {
      //代理类（房产中介）做了房东不能做的事情，额外拓展功能
      seeHouse();
      heTong();
      fare();
      //房产中介调用房东的rent功能方法
      houseHold.rent();

   }
   public  void fare(){
      System.out.println("房产中介收取中介费");
   }
   public  void seeHouse(){
      System.out.println("房产中介带客户看房子");
   }
   public  void heTong(){
      System.out.println("房产中介和客户签订房租合同");
   }
}
