package com.niao.config;

import com.niao.pojo.Person;
import com.niao.pojo.User;
import org.springframework.context.annotation.*;

/**
 * @author HuangSir
 * @create 2021-07-03 14:30
 */
@Configuration
@ComponentScan("com.niao.pojo")
@Import(TestImportConfig.class)
public class NiaoConfig {
   //@Bean相当于之前的<bean>标签，告诉Spring我这个方法将要返回一个对象，返回的对象
   //将要注册成为IOC上下文中的Bean对象
   @Bean
   //方法的返回值类型就相当于之前的class属性
   //方法的方法名就相当于之前的id属性（创建出来托管注册的对象名称）
   public User user() {
      return new User();
   }
   @Bean
   public Person person(){
      return  new Person();
   }
}
