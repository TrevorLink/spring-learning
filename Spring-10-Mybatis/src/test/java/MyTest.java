import com.niao.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author HuangSir
 * @create 2021-07-04 21:08
 */
public class MyTest {
   @Test
   public  void testEnvironment() throws IOException {
      //读配置文件流
      String resource="mybatis-config.xml";
      InputStream is = Resources.getResourceAsStream(resource);
      //使用SqlSessionFactoryBuilder构建SqlSessionFactory，只用一次所以匿名就行
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
      //创建SqlSession并设置自动提交事务
      SqlSession sqlSession = sqlSessionFactory.openSession(true);
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      mapper.queryUsers().forEach(System.out::println);
   }
   @Test
   public  void testCombination(){
      //我们不再需要显式创建SqlSession和之前一堆乱七八糟的MybatisUtils的东西了
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //直接从IOC里面取
      UserMapper userService = context.getBean("userService", UserMapper.class);
      userService.queryUsers().forEach(System.out::println);
   }
   @Test
   public  void testPro(){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      UserMapper userServicePro = context.getBean("userServicePro", UserMapper.class);
      userServicePro.queryUsers().forEach(System.out::println);
   }
}
