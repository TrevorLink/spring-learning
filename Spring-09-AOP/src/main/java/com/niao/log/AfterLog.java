package com.niao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author HuangSir
 * @create 2021-07-04 13:43
 */
public class AfterLog implements AfterReturningAdvice {
   //要实现增强，这个是包围的后置方法
   @Override
   //returnValue：由于这个日志是具体到方法结束后输出的，因此可以通过反射获取返回值
   //method：要执行的接口中的哪一个方法？
   //args：方法的参数列表
   //target：要代理的哪一个接口？
   public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
      System.out.println(method.getName()+"方法执行完毕，返回值为："+returnValue);
   }
}
