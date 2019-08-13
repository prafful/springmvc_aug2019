package com.cts.memberservice.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.memberservice.vo.Member;


@Component
public class EmailValidation implements Validator{

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return Member.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memberid", "errors.memberid");
		
	}

}
