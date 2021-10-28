package com.niao.dao;

/**
 * 用户增加的需求
 * @author HuangSir
 * @create 2021-06-20 21:36
 */
public class UserDaoMysqlImpl implements UserDao{
   @Override
   public void getUser() {
      System.out.println("Mysql的查找");
   }
}
