package com.springmvc.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	


}
