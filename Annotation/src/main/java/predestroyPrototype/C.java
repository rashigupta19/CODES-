package predestroyPrototype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c_bean")

@Scope("prototype")
public class C implements DisposableBean{
	
	public C(){
		System.out.println("C called");
	}
	@PostConstruct
	public void init() {
		System.out.println("init method call");
	}
	@Override
    public void destroy() throws Exception {
        System.out.println("destroy method call");
    }
}