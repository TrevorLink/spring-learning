import com.niao.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-05 10:48
 */
public class MyTest {
   @Test
   public  void  testEnvironment(){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      context.getBean("userService", UserMapper.class).queryUsers().forEach(System.out::println);
   }
}
