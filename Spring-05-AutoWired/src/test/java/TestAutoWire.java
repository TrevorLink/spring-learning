import com.niao.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangSir
 * @create 2021-07-02 15:37
 */
public class TestAutoWire {
   @Test
   public  void testEnvironment(){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Person person = context.getBean("person", Person.class);
      person.getCat().shout();
      person.getDog().shout();
   }
   @Test
   public  void testByName(){
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Person personByName = context.getBean("personByName", Person.class);
      personByName.getDog().shout();
      personByName.getCat().shout();
   }
   @Test
   public  void  testByType(){
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Person personByType = context.getBean("personByType", Person.class);
      personByType.getCat().shout();
      personByType.getDog().shout();
   }
   @Test
   public  void  testAnnotation(){
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Person person = context.getBean("person", Person.class);
      person.getDog().shout();
      person.getCat().shout();
   }
}
