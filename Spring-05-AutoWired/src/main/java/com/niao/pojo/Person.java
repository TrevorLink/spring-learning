package com.niao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author HuangSir
 * @create 2021-07-02 15:31
 */
public class Person {
   //一个人有两个宠物
@Autowired
   private  Cat cat;
@Autowired
   private  Dog dog;
   private  String  name;

   public Cat getCat() {
      return cat;
   }

   public void setCat(Cat cat) {
      this.cat = cat;
   }

   public Dog getDog() {
      return dog;
   }

   public void setDog(Dog dog) {
      this.dog = dog;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
