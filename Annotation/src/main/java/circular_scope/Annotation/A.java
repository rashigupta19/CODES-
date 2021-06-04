package circular_scope.Annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;
@Component("a_bean")
@Scope("singleton")
//@Scope("prototype")
@Lazy(true)
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
		System.out.println("A called");
	}
	@PostConstruct
	public void init() {
		System.out.println("init method call");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method call");
	}
}