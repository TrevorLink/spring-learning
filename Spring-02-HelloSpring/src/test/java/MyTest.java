import com.niao.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-01 14:07
 */
public class MyTest {
   public static void main(String[] args) {
      //获取Spring的上下文对象
      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      //我们的对象现在都在Spring中管理，要使用直接取就完事了
      Hello hello= (Hello) context.getBean("hello");
      System.out.println(hello.toString());
   }
}
