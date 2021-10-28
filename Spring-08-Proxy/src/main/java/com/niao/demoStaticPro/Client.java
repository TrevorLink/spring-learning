package com.niao.demoStaticPro;

/**
 * @author HuangSir
 * @create 2021-07-03 22:47
 */
public class Client {
   public static void main(String[] args) {
      //用户只需要选定下这个被代理类
      UserServiceImpl userService = new UserServiceImpl();
      //由代理类去代理这个被代理类
      UserServiceImplProxy proxy = new UserServiceImplProxy();
      proxy.setUserService(userService);
      //用户与代理类接触，代理类执行操作
      proxy.query();
   }
}
