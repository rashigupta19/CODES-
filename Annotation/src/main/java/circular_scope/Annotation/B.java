package circular_scope.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b_bean")
@Scope("singleton")
//@Scope("prototype")
@Lazy(true)
public class B {
	
	private C c;
	
	public C getC() {
		return c;
	}
	
	@Autowired
	public void setC(C c) {
		this.c = c;
	}
	
	public B() {
		System.out.println("B called");
	}
}