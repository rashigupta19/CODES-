package annCircularScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("a_bean")
@Scope("singleton")
public class A {
	
	private B b;
	
	public B getB() {
		return b;
	}
	
	@Autowired
	public void setB(B b) {
		this.b = b;
	}
	
	public A() {
		System.out.println("Cons A call");
	}
}