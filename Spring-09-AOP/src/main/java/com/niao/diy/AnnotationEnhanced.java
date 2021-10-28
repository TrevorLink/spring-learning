package com.niao.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author HuangSir
 * @create 2021-07-04 19:39
 */
@Aspect
public class AnnotationEnhanced {
   @Before("execution(* com.niao.service.UserServiceImpl.*(..))")
   public  void before(){
      System.out.println("====前====");
   }
   @After("execution(* com.niao.service.UserServiceImpl.*(..))")
   public  void after(){
      System.out.println("====后====");
   }
   @Around("execution(* com.niao.service.UserServiceImpl.*(..))")
   public  void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
      System.out.println("====环绕前====");
      //打印连接点对象，execution(void com.niao.service.UserService.update())
      System.out.println(proceedingJoinPoint);
      //获得连接点对象的签名
      System.out.println(proceedingJoinPoint.getSignature());
      //连接点执行操作，相当于Filter的doFilter()
      proceedingJoinPoint.proceed();
      System.out.println("====环绕后====");
   }
}
