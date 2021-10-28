package com.niao.demoDynamicPro;

import com.niao.demoStaticPro.UserService;
import com.niao.demoStaticPro.UserServiceImpl;

/**
 * @author HuangSir
 * @create 2021-07-04 10:23
 */
public class Client {
   public static void main(String[] args) {
      //提供被代理类对象
      UserServiceImpl userService = new UserServiceImpl();
      //创建处理角色
      ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
      //设置代理类要代理哪一个接口（多态）
      proxyInvocationHandler.setTarget(userService);
      //创建代理类对象
      //注意这里强转一定要是强转成接口类型，不能强转成被代理类的类型
      UserService proxy = (UserService) proxyInvocationHandler.getProxy();
      //调用
      proxy.query();
   }
}
