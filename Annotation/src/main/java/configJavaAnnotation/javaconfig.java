package configJavaAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("configJavaAnnotation")
public class javaconfig {
	
	@Bean
	public Employee emp() {
		return new Employee();
	}

}
