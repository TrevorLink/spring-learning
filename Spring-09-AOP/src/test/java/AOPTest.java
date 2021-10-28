import com.niao.service.UserService;
import com.niao.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-04 14:18
 */
public class AOPTest {
   @Test
   public  void test() {
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     //还是那个问题，动态代理代理的是接口，不可以是实现类！！
      UserService userService = context.getBean("userService", UserService.class);
      userService.update();
   }
}
