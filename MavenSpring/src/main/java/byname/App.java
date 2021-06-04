package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  public static void main( String[] args )
  {
    
      ApplicationContext context=new ClassPathXmlApplicationContext("byname.xml");
      Driver drive=(Driver)context.getBean("driver_name");
      System.out.println(drive.toString());
  
  }
}