package com.niao.mapper;

import com.niao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author HuangSir
 * @create 2021-07-05 10:08
 */
public class UserMapperImplPro extends SqlSessionDaoSupport implements UserMapper {
   @Override
   public List<User> queryUsers() {
      return getSqlSession().getMapper(UserMapper.class).queryUsers();
   }
}
