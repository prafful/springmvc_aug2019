package com.springmvc.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/index")
	public String getLandingPage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") EmployeePojo employeePojo) {
		System.out.println(employeePojo.getName() + " " + employeePojo.getSalary() + " " + employeePojo.getDesignation());
		int numberOfRowsEffected = employeeDao.saveEmployee(employeePojo);
		return "redirect:/listEmployee.html";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		return new ModelAndView("addemployee", "command", new EmployeePojo());
	}
	
	@RequestMapping(value = "listEmployee", method = RequestMethod.GET )
	public ModelAndView listEmployee() {
		List<EmployeePojo> all = employeeDao.listEmployee();
		return new ModelAndView("listemployee", "allemployees", all);
		
	}
	
	@RequestMapping(value="editEmployee", method = RequestMethod.GET)
	public ModelAndView editEmployee(@RequestParam("id") int id) {
		System.out.println("Get employee with id: " + id);
		EmployeePojo employeeEdit = employeeDao.getEmployeeById(id);
		return new ModelAndView("updateemployee", "command", employeeEdit);
		 
	}
	
	
	@RequestMapping(value = "updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute EmployeePojo employee) {
		System.out.println("Updating employee with id: " + employee.getId());
		employeeDao.updateEmployee(employee);
		return "redirect:/listEmployee.html";
	}
	
}
