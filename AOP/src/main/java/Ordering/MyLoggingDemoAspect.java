package Ordering;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyLoggingDemoAspect {
	
	@Before("execution(public void addAccount())")
	public void logToCloudAdvice() {
	
	System.out.println("logging aspect ");
	
}

}
