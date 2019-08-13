package com.cts.memberservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.memberservice.vo.Member;
 

@Controller
public class MembershipController {

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
		Map<String , String> services = new HashMap<String, String>();
		services.put("premiumduereminder", "Premium Due Reminder");
		services.put("paymentduenotification", "Payment Due Notification");
		services.put("policychanges", "Policy Changes");
		mv.addObject("premiumservices", services);
		mv.addObject("member", new Member());
		mv.setViewName("subscribe");
		return mv;
		
	}
	
	@RequestMapping( value = "/subscribeServices", method = RequestMethod.POST)
	public ModelAndView subscribeServices(@ModelAttribute Member member) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", member.getMembername());
		mv.setViewName("success");
		return mv;
	}
	
	
	
}
