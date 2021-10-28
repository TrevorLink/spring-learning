package com.niao.mapper;

import com.niao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author HuangSir
 * @create 2021-07-05 10:43
 */
public interface UserMapper {
   List<User> queryUsers();

   int addUser(User user);

   int deleteUser(@Param("id") int id);
}
