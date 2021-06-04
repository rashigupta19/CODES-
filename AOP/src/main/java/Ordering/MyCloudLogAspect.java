package Ordering;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyCloudLogAspect {
	
	@Before("execution(public void addAccount())")
		public void beforeAddAccountAdvice() {
		
		System.out.println("cloud advice");
		
	}

}
