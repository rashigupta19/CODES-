package circular_scope.Annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c_bean")
@Scope("singleton")
//@Scope("prototype")
public class C {
	
	public C(){
		System.out.println("C called");
	}
}