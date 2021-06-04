package com.ncu.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@After("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @After advice on addAccount()");
		
	}
}