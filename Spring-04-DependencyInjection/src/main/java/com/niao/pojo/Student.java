package com.niao.pojo;

import java.util.*;

/**
 * @author HuangSir
 * @create 2021-07-02 9:06
 */
public class Student {
   //之前学过的使用value注入值
   private  String  name;
   //之前学过的使用ref注入值
   private  Address address;
   //数组类型
   private  String[] books;
   //List集合
   private List<String> hobbies;
   //Map集合
   private Map<String,String> card;
   //Set集合
   private Set<String> games;
   //Null
   private  String wife;
   //Properties配置文件
   private Properties info;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public String[] getBooks() {
      return books;
   }

   public void setBooks(String[] books) {
      this.books = books;
   }

   public List<String> getHobbies() {
      return hobbies;
   }

   public void setHobbies(List<String> hobbies) {
      this.hobbies = hobbies;
   }

   public Map<String, String> getCard() {
      return card;
   }

   public void setCard(Map<String, String> card) {
      this.card = card;
   }

   public Set<String> getGames() {
      return games;
   }

   public void setGames(Set<String> games) {
      this.games = games;
   }

   public String getWife() {
      return wife;
   }

   public void setWife(String wife) {
      this.wife = wife;
   }

   public Properties getInfo() {
      return info;
   }

   public void setInfo(Properties info) {
      this.info = info;
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", address=" + address +
              ", books=" + Arrays.toString(books) +
              ", hobbies=" + hobbies +
              ", card=" + card +
              ", games=" + games +
              ", wife='" + wife + '\'' +
              ", info=" + info +
              '}';
   }
}
