package com.springmvc.hibernate.beginner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.hibernate.beginner.dao.EmployeeDao;
import com.springmvc.hibernate.beginner.entity.EmployeeEntity;


@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public void saveEmployee(EmployeeEntity ee) {
		// TODO Auto-generated method stub
		employeeDao.saveEmployee(ee);
	}

	public List viewAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.viewAllEmployees();
	}

	public EmployeeEntity getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}
	
	

}
