import com.niao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-01 20:22
 */
public class MyTest {
   public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      User user = (User) context.getBean("userPlus");
      user.show();
   }
}
