package pointcutCombination;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	
	@Pointcut("execution(* * get*(..))")
    public void ss() {}
	
	
	@Pointcut("execution(* *.*(..))")
    public void aa() {}
	
	
	@After("ss() && aa()")
	public void AddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @After advice on addAccount()");
		
	}
	
	
}