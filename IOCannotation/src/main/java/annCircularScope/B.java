package annCircularScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b_bean")
@Scope("prototype")
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
		System.out.println("Cons B call");
	}
}