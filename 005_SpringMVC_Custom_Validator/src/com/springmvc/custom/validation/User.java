package com.springmvc.custom.validation;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	
	private String email;
	
	
	private String password;
	

	private String location;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public User(String email, String password, String location) {
		super();
		this.email = email;
		this.password = password;
		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public User() {
		
	}

	
	
	

}
