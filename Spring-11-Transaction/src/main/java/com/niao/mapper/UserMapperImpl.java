package com.niao.mapper;

import com.niao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author HuangSir
 * @create 2021-07-05 10:47
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
   @Override
   public List<User> queryUsers() {
      addUser(new User(2,"niaoniao","123321"));
      deleteUser(2);
      return getSqlSession().getMapper(UserMapper.class).queryUsers();
   }

   @Override
   public int addUser(User user) {
      return  getSqlSession().getMapper(UserMapper.class).addUser(user);
   }

   @Override
   public int deleteUser(int id) {
      return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
   }
}
