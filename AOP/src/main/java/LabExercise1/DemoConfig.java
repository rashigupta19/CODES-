package LabExercise1;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan("LabExercise1")
public class DemoConfig {

	@Bean
	public Employee emp() {
		return new Employee();
	}
}