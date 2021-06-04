package LabExercise1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	@Before("execution(public String getName())")
	public void beforeGetName() {
		
		System.out.println("Before get Name");
		
	}
	
	@After("execution(public String setName(..))")
	public void afterSetName() {
		
		System.out.println("After set Name");
		
	}
	
	@Around("execution(public int calculate_sal())")
	public int AddAccountAdvice() {
		
		System.out.println("Around calculate Salary");
		
		return 20000;
	}
}