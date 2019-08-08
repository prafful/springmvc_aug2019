package com.springmvc.custom.validation;



import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {


	public boolean supports(Class cls) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password");
		
	}
	
	

}
