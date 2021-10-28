import com.niao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-03 11:02
 */
public class AnnotationTest {
   @Test
   public void test() {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      User user1 = context.getBean("user", User.class);
      User user2 = context.getBean("user", User.class);
      System.out.println(user1==user2);
   }
}
