package com.springmvc.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormValidationController {

	@RequestMapping("/index")
	public String welcome(Model model) {
		
		model.addAttribute("userform", new User());
		return "signin";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public String checkLogin(@Valid @ModelAttribute("userform") User user, BindingResult result) {
		if(result.hasErrors()) {
			return "signin";
		}
		
		return "welcome";
	}
	
	
}
