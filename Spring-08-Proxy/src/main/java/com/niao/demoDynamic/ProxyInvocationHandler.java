package com.niao.demoDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 相当于是一个房产公司
 * @author HuangSir
 * @create 2021-07-04 10:14
 */
public class ProxyInvocationHandler implements InvocationHandler {
//房产中介公司要持有出租房子这个功能
   private Rent rent;
//房产公司提供一个中介去关联客户联系房东
   public void setRent(Rent rent) {
      this.rent = rent;
   }
//动态获得代理类（房产中介）
   public Object getProxy() {
      //第一个参数，类的加载器，第二个参数，代理类要实现的接口（这里就是rent）,第三个参数：InvocationHandler对象
      return Proxy.newProxyInstance(rent.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
   }
   //假如我之后还要增强方法，加入两个新的功能实现，那么我们只需要加进Invoke方法即可
   private   void showHouse(){
      System.out.println("中介带客户看房子");
   }
   private   void fare(){
      System.out.println("中介收取中介费");
   }
   @Override
   //处理代理实例，并返回结果
   //代理类之所以可以调用接口里面的方法，就是invoke方法通过反射获取到了rent接口的方法
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      showHouse();
      Object result=method.invoke(rent,args);
      fare();
      return  result;
   }
}
