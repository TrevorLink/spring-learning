import com.niao.pojo.Student;
import com.niao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-02 9:21
 */
public class DependencyInjunctionTest {
   @Test
   public void testFirst() {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Student student = (Student) context.getBean("student");
      System.out.println(student);
   }

   @Test
   public void testP() {
      ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
      //通过反射可以省去强转
      User userTestP = context.getBean("userTestP", User.class);
      System.out.println(userTestP);
   }
   @Test
   public  void testC(){
      ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
      //通过反射可以省去强转
      User userTestC = context.getBean("userTestC", User.class);
      System.out.println(userTestC);
   }
   @Test
   public  void testSingletonOrPrototype(){
      ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
      User user1 = context.getBean("user", User.class);
      User user2 = context.getBean("user", User.class);
      System.out.println(user1 == user2);
   }
}
