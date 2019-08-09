package com.springmvc.hibernate.beginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.hibernate.beginner.entity.EmployeeEntity;
import com.springmvc.hibernate.beginner.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/index")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/employeeform")
	public ModelAndView displayForm() {
		return new ModelAndView("addemployee", "emp_instance", new EmployeeEntity());
	}
	
	
	@RequestMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute ("emp_instance") EmployeeEntity ee) {
		//implemement a code to save employee to database using hibernate
		System.out.println("In controller - ");
		System.out.println("Name:" + ee.getEmployeeName());
		System.out.println("Salary:" + ee.getEmployeeSalary());
		System.out.println("Des:" + ee.getEmployeeDesignation());
		employeeService.saveEmployee(ee);
		return "redirect:/viewallemployee.html";
	}
	
	@RequestMapping("/viewallemployee")
	public String viewAllEmployees() {
		return "viewemployee";
	}
	
	
	
	
	
	
	

}
