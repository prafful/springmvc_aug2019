package com.springmvc.beginner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCHelloWorld {

	//@RequestMapping("/welcome.spring") //not required
	@RequestMapping("/welcome")
	public ModelAndView sayMessage() {
		String passit = "Hello from Spring MVC";
		//  return and look for prefix + welcome + suffix
		// return and look for /WEB-INF/jsp/welcome.jsp
		return new ModelAndView("welcome", "message", passit);
	}
	
	@RequestMapping("/hello")
	public String sendStringMessage() {
		//return and look for /WEB-INF/jsp/hello.jsp
		return "kitchen";
	}
	
	@RequestMapping("/helloall")
	public String sendMultipleMessageWithView(Model model) {
		
		model.addAttribute("message1","Exploring Spring MVC");
		model.addAttribute("message2", "It is easy!");
		model.addAttribute("message3", "Next will be Hibernate!!!!");
		
		return "united";
	
	}
	
	@RequestMapping("/supermessage")
	public ModelAndView sendSuperMessage(ModelAndView modelAndView) {
		
		modelAndView.addObject("topicName", "Spring MVC and Objects!!!!");
		modelAndView.addObject("duration", 17);
		modelAndView.setViewName("technology");
		return modelAndView;
		
	}
	
	
}
