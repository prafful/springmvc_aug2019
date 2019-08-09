package com.springmvc.hibernate.beginner.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.beginner.entity.EmployeeEntity;

@Repository("employeeDao")
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveEmployee(EmployeeEntity ee) {
		// TODO Auto-generated method stub
		System.out.println("In Dao - ");
		System.out.println("Name:" + ee.getEmployeeName());
		System.out.println("Salary:" + ee.getEmployeeSalary());
		System.out.println("Des:" + ee.getEmployeeDesignation());
		
		Session session = null;
		
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		
		session.save(ee);
		
		session.flush();
		
		
		
	}
	

}
