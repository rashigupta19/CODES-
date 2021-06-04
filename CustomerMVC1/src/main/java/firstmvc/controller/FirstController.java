package firstmvc.controller;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import firstmvc.models.CustomerInfo;

@Controller
@SessionAttributes("employee")

public class FirstController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}


	@RequestMapping("/hello")
	public String start(Model model) {	
		return "index";
	}



	@RequestMapping(path = "/showform",method = RequestMethod.GET)
	public String doLogin(Model model) {
		model.addAttribute("employee", new CustomerInfo());
		return "login";
	}

	@RequestMapping(value = "/processform",method = RequestMethod.GET)
	public String submit( @Valid@ModelAttribute("employee")CustomerInfo customer,BindingResult theBindingResult,Model model) throws Exception{
    
	
		model.addAttribute("name", customer.getName());
		model.addAttribute("contactNumber", customer.getContactNumber());
		model.addAttribute("email", customer.getEmail());
		

		
//		System.out.println("ddd"+customer.getEmail());
		
		if (theBindingResult.hasErrors()) {
			return "login";
		}
		else {
			return "loginSuccess";

		}
	}
	
	
	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("employee") CustomerInfo customer) {

	      System.out.println("Email: " + customer.getEmail());
	      System.out.println("First Name: " + customer.getName());

	      return "index";
	   }
	
	@RequestMapping("/init")
	public String initView(Model model) {
	System.out.println("Handler method is called.");

	 model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
	return "login";
	}
	
	
}


