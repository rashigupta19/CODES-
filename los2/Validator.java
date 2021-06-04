package los2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Validator{
	
	public boolean isValidType(String type) {
		
		if(type.equalsIgnoreCase("hl") || type.equalsIgnoreCase("pl") || type.equalsIgnoreCase("al")) {
			return true;
		}
		else
			return false;
		
	}
	
	public boolean isValidAge(int age) {
		if(age<18 || age>100) {
			return false;
		}
		else
			return true;
	}
	
	public boolean isValidAadharNumber(String str){
        // Regex to check valid Aadhar number.
        //String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

		String regex = "^([0-9]){12}?$";
      
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();
    }
	
	public boolean isValidPhone(String str){
        // Regex to check valid Aadhar number.
        //String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

		String regex = "(0/91)?[7-9][0-9]{9}";
      
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);
        
//        System.out.println("Is the above phone number valid? " + str.matches(regex));

        return m.matches();
    }
	
	public boolean isValidEmail(String str){
        // Regex to check valid Aadhar number.
        //String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

		String regex = "^(.+)@(.+)$";
      
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);
        
        //System.out.println("Is the above phone number valid? " + str.matches(regex));

        return m.matches();
    }
	
}