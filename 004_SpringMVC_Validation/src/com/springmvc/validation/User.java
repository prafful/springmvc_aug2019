package com.springmvc.validation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Email
	@NotEmpty
	private String email;
	
	@Size(min = 6, max = 10, message = "Size.userform.password")
	private String password;

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

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User() {
		
	}
	
	
	
	

}
