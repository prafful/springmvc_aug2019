package com.springmvc.beginner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCHelloWorld {

	
	@RequestMapping("/welcome")
	public ModelAndView sayMessage() {
		String message = "Hello from Spring MVC";
		return new ModelAndView("welcome", "msg", message);
	}
	
}
