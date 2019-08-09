package com.springmvc.hibernate.beginner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity			//Entity will use hibernate to create table with below structure
@Table(name = "employee")	//create table with name employee using hibernate
public class EmployeeEntity {
	
	@Id								//use following clsss variable as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  //auto increment the primary key
	@Column(name = "emp_id")  //create column with name - emp_id
	private int id;
	
	@Column(name = "emp_name") 
	private String employeeName;
	
	@Column(name = "emp_salary") 
	private String employeeSalary;
	
	@Column(name = "emp_designation") 
	private String employeeDesignation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public EmployeeEntity(int id, String employeeName, String employeeSalary, String employeeDesignation) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDesignation = employeeDesignation;
	}
	public EmployeeEntity() {
		super();
	}
	
	
	

}
