package com.niao.demoDynamic;

/**
 * @author HuangSir
 * @create 2021-07-04 10:19
 */
public class Client {
   public static void main(String[] args) {
      //首先必须要有一个被代理类
      HouseHold houseHold  = new HouseHold();
      //之后我们创建一个程序处理角色InvocationHandler来处理接口中的方法
      ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
      //可是创建的时候我还不知道你要给我哪个接口呢?
      //所以这里我们要设置好他的接口
      proxyInvocationHandler.setRent(houseHold);
      //获取代理类实例
      Rent proxy = (Rent) proxyInvocationHandler.getProxy();
      //当调用代理类实例的方法时实际上是通过反射获取接口中的方法，
      // 走的是InvocationHandler的方法
      proxy.rent();
   }
}
