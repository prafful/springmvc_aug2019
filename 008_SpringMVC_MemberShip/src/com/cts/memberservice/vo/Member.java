package com.cts.memberservice.vo;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Member {
	
	//@Size(min = 5, max = 8, message = "Size.memberform.memberid")
	private int memberid;
	
	@NotEmpty
	private String membername;
	
	
	private String email;
	
	private List services;
	
	private String subscribe;
	
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List getServices() {
		return services;
	}
	public void setServices(List services) {
		this.services = services;
	}
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public Member(int memberid, String membername, String email, List services, String subscribe) {
		super();
		this.memberid = memberid;
		this.membername = membername;
		this.email = email;
		this.services = services;
		this.subscribe = subscribe;
	}
	
	public Member() {
		super();
	
	}

}
