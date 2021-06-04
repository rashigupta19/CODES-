package annCircularScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c_bean")
@Scope("singleton")
public class C {
	
	public C(){
		System.out.println("Cons C call");
	}
}