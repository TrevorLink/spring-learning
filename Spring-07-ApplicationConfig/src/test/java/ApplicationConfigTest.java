import com.niao.config.NiaoConfig;
import com.niao.pojo.Person;
import com.niao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-03 14:51
 */
public class ApplicationConfigTest {
   @Test
   public  void testConfig(){
      //通过创建AnnotationConfigApplicationContext实例化Spring的IOC容器//
      //并且通过配置类的class反射加载
      ApplicationContext context = new AnnotationConfigApplicationContext(NiaoConfig.class);
      User user = context.getBean("user", User.class);
      Person person = context.getBean("person", Person.class);
      System.out.println(person);
      System.out.println(user);
   }
}
