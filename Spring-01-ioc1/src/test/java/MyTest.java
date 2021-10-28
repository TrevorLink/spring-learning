import com.niao.dao.UserDaoImpl;
import com.niao.dao.UserDaoMysqlImpl;
import com.niao.service.UserService;
import com.niao.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟用户操作
 * @author HuangSir
 * @create 2021-06-20 21:45
 */
public class MyTest {
   public static void main(String[] args) {
      UserService userService = new UserServiceImpl();
//      userService.getUser();
      //这里值得注意的是多态创建的对象，不能访问子类特有的成员（impl的set方法），所以必须强转，接口中没有set方法
      //即接口不能调用实现类特有的方法
      ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
      //我随你怎么自己DIY
      ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
      userService.getUser();
   }
@Test
   public  void testSpring(){
      //获取Spring的ApplicationContext容器
   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
   //有点像工厂模式，容器在手随便get
   UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
   userServiceImpl.getUser();
}
}
