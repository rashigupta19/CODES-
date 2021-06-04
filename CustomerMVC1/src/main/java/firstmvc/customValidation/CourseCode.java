package firstmvc.customValidation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.ElementType;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	
	public String[] value() default {"CSE","ECE"};
	
	public String message() default "must start with CSE,ECE";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};

	
	
	
	
	

}
