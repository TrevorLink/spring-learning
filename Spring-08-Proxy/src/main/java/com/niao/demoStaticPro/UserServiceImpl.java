package com.niao.demoStaticPro;

/**
 * @author HuangSir
 * @create 2021-07-03 20:05
 */
public class UserServiceImpl implements UserService{
   @Override
   public void add() {
      System.out.println("增加了一个用户信息");
   }

   @Override
   public void delete() {
      System.out.println("删除了一个用户信息");
   }

   @Override
   public void update() {
      System.out.println("更新了一个用户信息");
   }

   @Override
   public void query() {
      System.out.println("查询了一个用户信息");
   }
}
