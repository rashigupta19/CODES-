package com.ncu.project.LoanOrganizationSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        NewLoanApply ee = (NewLoanApply)context.getBean("cc",NewLoanApply.class);
        System.out.println(ee.toString());
        ee.CaculateIncome();
           ee.UserDetails();
       
        
    }
}
