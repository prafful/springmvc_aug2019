package com.springmvc.hibernate.beginner.dao;

import java.util.List;

import javax.persistence.Query;
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
		System.out.println("Id:" + ee.getId());
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
		
		if(ee.getId() != 0) {
			session.update(ee);
		}
		else {
			session.save(ee);
		}
		
		
		session.flush();
		
		
		
	}

	public List viewAllEmployees() {
		// TODO Auto-generated method stub
		Session session = null;
		
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		
		Query query = session.createQuery("from EmployeeEntity");
		return query.getResultList();
		
		
	}

	public EmployeeEntity getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		
		EmployeeEntity ee = session.get(EmployeeEntity.class, id);
		if(ee != null) {
			return ee;
		}else {
			System.out.println("Employee with id: " + id + " not available!");
		}
		
		return ee;
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		
		EmployeeEntity ee = session.get(EmployeeEntity.class, id);
		if(ee != null) {
			session.delete(ee);
		}else {
			System.out.println("Employee with id: " + id + " does not exist!!!!");
		}
		
		session.flush();
		
	}
	

}
