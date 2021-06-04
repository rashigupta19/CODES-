package LabExercise2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	
	@Pointcut("execution(public void addAccount())")
    public void ss() {
	}
	@After("ss()")
	public void AddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @After advice on addAccount()");
		
	}
	
	@Before("ss()")
	public void AddEmployee() {
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
}