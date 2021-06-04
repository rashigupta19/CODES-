package annLazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b_bean")
@Scope("singleton")

public class B {
	private A a;

	public A getA() {
		return a;
	}
	@Autowired
	public void setA(A a) {
		this.a = a;
	}

	public B() {
		System.out.println("Constructor of B class");
	}

}
