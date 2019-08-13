package com.cts.memberservice.vo;

import java.util.List;
import java.util.Map;

public class Member {
	
	private Long memberid;
	private String membername;
	private String email;
	private List services;
	private String subscribe;
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
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
	public Member(Long memberid, String membername, String email, List services, String subscribe) {
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
