package com.cts.memberservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.memberservice.validation.EmailValidation;
import com.cts.memberservice.vo.Member;
 

@Controller
public class MembershipController {
	
	@Autowired
	private EmailValidation emailValidation;

	@RequestMapping("/pharmacy")
	public String openPharmacyPage() {
		return "pharmacy";
	}
	
	
	@RequestMapping("/benefits")
	public String openBenefitsPage() {
		return "benefits";
	}
	
	@RequestMapping("/subscribe")
	public ModelAndView openSubscribePage() {
		ModelAndView mv = new ModelAndView();
		List services = new ArrayList();
		services.add("Premium Due Reminder");
		services.add("Payment Due Notification");
		services.add("Policy Changes");
		mv.addObject("premiumservices", services);
		mv.addObject("memberform", new Member());
		mv.setViewName("subscribe");
		return mv;
		
	}
	
	@RequestMapping( value = "/subscribeServices", method = RequestMethod.POST)
	public ModelAndView subscribeServices(@Valid @ModelAttribute("memberform") Member member, BindingResult result) {
		
		emailValidation.validate(member, result);
		
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("subscribe");
			return mv;
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", member.getMembername());
		mv.setViewName("success");
		return mv;
	}
	
	
	
}
