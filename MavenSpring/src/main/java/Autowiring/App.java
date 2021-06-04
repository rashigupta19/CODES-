package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");



    Employee ee = (Employee)context.getBean("cc", Employee.class);
    System.out.println(ee.toString());

}
}
