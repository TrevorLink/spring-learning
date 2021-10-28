package com.niao.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author HuangSir
 * @create 2021-07-04 13:41
 */
public class BeforeLog implements MethodBeforeAdvice {
   //要实现增强，这个是包围的前置
   @Override
   //method：要执行的接口中的哪一个方法？
   //args：方法的参数列表
   //target：要代理的哪一个接口？
   public void before(Method method, Object[] args, Object target) throws Throwable {
      System.out.println("调用了来自"+target.getClass().getName()+"的"+method.getName()+"方法");
   }
}
