package javaconfigcoach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(javaconfig.class);
    	
        BasketballCoach ball1=ac.getBean("bcoach",BasketballCoach.class);
    	
    	System.out.println(ball1.getDailyWorkout());
    	System.out.println(ball1.getDailyFortune());
    	
    	
    }
}
