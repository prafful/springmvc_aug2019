package com.springmvc.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.crud.pojo.UserPojo;

@Controller
public class CRUDController {
	
	List<UserPojo> users = new ArrayList<UserPojo>();
	
	@RequestMapping("/home")
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUserMethod() {
		//command object - it is reserved request attribute name. you can use it with form element
		return new ModelAndView("add_user" , "command", new UserPojo());
	}
	
	@RequestMapping("/listUser")
	public ModelAndView listUserMethod() {
		System.out.println("List of all users: ");
		System.out.println("Size: " + users.size());
		return new ModelAndView("list_user", "allUsers", users);
	}
		
	@RequestMapping(value = "/saveUser",  method = RequestMethod.POST)
	public ModelAndView saveUserMethod(@ModelAttribute("user") UserPojo userPojo ) {
		System.out.println("Received user from form: ");
		System.out.println("Username: " + userPojo.getUser_name());
		System.out.println("Location: " + userPojo.getLocation());
		//save received values to list
		users.add(userPojo);
		//redirect to /listuser
		return new ModelAndView("redirect:/listUser.html");
	}

}
