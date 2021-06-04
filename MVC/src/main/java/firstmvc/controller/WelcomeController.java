package firstmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import firstmvc.models.Users;

@Controller
public class WelcomeController {

	
	@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "vaishali");
		return "welcome";
	}
//	@RequestMapping("/login")
//	public String loginmsg(Model model) {
//		model.addAttribute("msg", "kalra login");
//		return "login";
//	}
//	@RequestMapping("/login")
//	public String doLogin(HttpServletRequest request, Model model) {
//		String userId=request.getParameter("userId");
//		model.addAttribute("msg", "kalra login"+userId);
//		return "login";
//			
		
//	}
	
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	public String doLogin() {
	return "login";
	}
//	
//	
//	@RequestMapping(path = "/welcome",method = RequestMethod.GET)
//	public String loginDone(@RequestParam(required = false, name ="userId") String uid, @RequestParam(required = false, name="pwd") String password, Model model) {
//	model.addAttribute("msg", "Hello  "+uid);
//	
//	return "welcome";
//	}
	
	
	@RequestMapping(path = "/welcome",method = RequestMethod.GET)
	public String loginDone(@ModelAttribute("userModel") Users user, Model model) {
	model.addAttribute("msg", "Hello "+user.getUserId());
	
	return "welcome";
	}
	
	
	

}
