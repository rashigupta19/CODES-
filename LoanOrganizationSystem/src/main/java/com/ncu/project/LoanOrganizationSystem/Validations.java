package com.ncu.project.LoanOrganizationSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	

    public static boolean isValidAadharNumber(String str)
    {
        // Regex to check valid Aadhar number.
        String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
 
      
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();
    }
 
}
