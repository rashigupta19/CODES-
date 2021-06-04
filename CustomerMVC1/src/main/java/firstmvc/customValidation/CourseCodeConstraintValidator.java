package firstmvc.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {


	private String[] coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub

		coursePrefix = theCourseCode.value();
		//	System.out.println(coursePrefix);
	}


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		boolean result=false;
		if(value!=null) {

			for(String prefix:coursePrefix) {
				result=value.startsWith(prefix);


				if (result) {
					break;
				}
			}
		}

		else {
			result=false;
		}


		return result;

	}
}
