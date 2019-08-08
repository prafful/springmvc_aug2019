package com.springmvc.custom.validation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class UserController {
	
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping("/index")
	public String welcome(Model m) {
		m.addAttribute("userform", new User());
		return "signin";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public String checkLogin(@ModelAttribute("userform") User user, BindingResult result) {
		
		userValidator.validate(user, result);
		
		
		if(result.hasErrors()) {
			return "signin";
		}
		
		return "welcome";
	}
	

}
