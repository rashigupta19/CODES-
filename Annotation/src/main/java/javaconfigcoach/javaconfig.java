package javaconfigcoach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("configJavaAnnotation")
public class javaconfig {
	
	@Bean
	public Fortune fortune() {
		return new Fortune();
	}
	
    @Bean
    public Coach bcoach() {
    	return new BasketballCoach(fortune());
    }
}
