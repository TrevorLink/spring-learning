package com.niao.service;

import com.niao.dao.UserDao;
import com.niao.dao.UserDaoImpl;
import com.niao.dao.UserDaoMysqlImpl;

/**
 * @author HuangSir
 * @create 2021-06-20 21:28
 */
public class UserServiceImpl implements UserService {
   //   //以往的代码，让Service层持有一个Dao层的引用，但是这样的写法，用户的需求一遍
//   我们就需要去修改代码
//   //用户需求变更，程序猿就要去改代码
//   private UserDao userDao = new UserDaoMysqlImpl();
   private UserDao userDao;

   //改进版----运用上了设计模式，我们留了一个接口，利用set进行动态实现值的注入
   public void setUserDao(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public void getUser() {
      userDao.getUser();
   }
}
