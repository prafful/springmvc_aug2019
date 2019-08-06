package com.springmvc.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int saveEmployee(EmployeePojo employeePojo) {
		//"insert into employee(name, salary, designation) values ('obb',4000, 'developer')"
		String sql = "insert into employee(name, salary, designation) values ('" +  employeePojo.getName() + "'," + employeePojo.getSalary() + ", '" + employeePojo.getDesignation() + "')";
		return jdbcTemplate.update(sql);
		
		
		
	}


	public List<EmployeePojo> listEmployee() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee", new RowMapper<EmployeePojo>() {

			@Override
			public EmployeePojo mapRow(ResultSet resultset, int row) throws SQLException {
				// TODO Auto-generated method stub
				EmployeePojo ep = new EmployeePojo();
				ep.setId(resultset.getInt(1));
				ep.setName(resultset.getString(2));
				ep.setSalary(resultset.getFloat(3));
				ep.setDesignation(resultset.getString(4));
				
				return ep;
			}
		
		});
		
	}

	public EmployeePojo getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select *  from employee where id=?"; 
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<EmployeePojo>(EmployeePojo.class));
	}


	public int updateEmployee(EmployeePojo employee) {
		// TODO Auto-generated method stub
		System.out.println("In DAO class for updating employee: " + employee.getId() + " " + employee.getName() + " " + employee.getSalary() + " " + employee.getDesignation());
		//update employee set name='omana', salary=4000, designation='developer' where id=1
		String sql = "update employee set name='"+employee.getName()+"',salary=" + employee.getSalary()+",designation='" + employee.getDesignation() + "' where id="+ employee.getId()+"";
		System.out.println(sql);
		int result = jdbcTemplate.update(sql);
		System.out.println(result);
		return result;
		
	}
	


}
