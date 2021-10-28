package com.niao.mapper;

import com.niao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 *这个类其实就是可以理解成为UserServiceImpl
 * @author HuangSir
 * @create 2021-07-05 9:52
 */
public class UserMapperImpl implements UserMapper{
  private SqlSessionTemplate sqlSession;

   public void setSqlSession(SqlSessionTemplate sqlSession) {
      this.sqlSession = sqlSession;
   }

   @Override
   public List<User> queryUsers() {
      //Service层获得Dao层的引用UserDaoImpl
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      //调用Dao层的业务
      return mapper.queryUsers();
   }
}
