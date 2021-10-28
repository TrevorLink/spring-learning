package com.niao.demoDynamicPro;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 相当于是一个房产公司
 *
 * @author HuangSir
 * @create 2021-07-04 10:14
 */
public class ProxyInvocationHandler implements InvocationHandler {
   //这个其实就是代理类要实现的接口，我们把它通用一般化了
   private Object target;

   //接口值注入，也可以通过构造器，但是Spring的IOC更喜欢set方法
   public void setTarget(Object target) {
      this.target = target;
   }

   //动态获得代理类
   public Object getProxy() {
      //第一个参数：类的加载器，第二个参数：代理类所要实现的接口，第三个参数：InvocationHandler
      return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
   }
//我们要增强的方法
   private void log(String msg) {
      System.out.println("[DEBUG]调用了"+msg+"方法");
   }

   @Override
   //处理代理实例，并返回结果
   //代理类之所以可以调用接口里面的方法，就是invoke方法通过反射获取到了接口的方法
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //调用反射方法动态传递方法名
      log(method.getName());
      return method.invoke(target, args);
   }
}
