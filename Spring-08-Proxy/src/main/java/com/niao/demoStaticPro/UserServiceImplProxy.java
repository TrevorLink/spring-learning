package com.niao.demoStaticPro;

/**
 * @author HuangSir
 * @create 2021-07-03 20:39
 */
public class UserServiceImplProxy implements UserService {
   //让代理类持有一个被代理类的引用
   private UserServiceImpl userService;

   //Spring IOC真正爱做的是set方法！
   public void setUserService(UserServiceImpl userService) {
      this.userService = userService;
   }

   @Override
   public void add() {
      //代理类做一下额外的扩展功能
      show("add");
      userService.add();
   }

   @Override
   public void delete() {
      //代理类做一下额外的扩展功能
      show("delete");
      userService.delete();
   }

   @Override
   public void update() {
      //代理类做一下额外的扩展功能
      show("update");
      userService.update();
   }

   @Override
   public void query() {
      //代理类做一下额外的扩展功能
      show("query");
      userService.query();
   }

   private void show(String msg) {
      System.out.println("[DEBUG]调用了" + msg + "方法");
   }
}
