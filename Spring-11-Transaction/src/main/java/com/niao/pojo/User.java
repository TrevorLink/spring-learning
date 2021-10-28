package com.niao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HuangSir
 * @create 2021-07-04 20:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private  int id;
   private  String name;
   private  String pwd;
}
