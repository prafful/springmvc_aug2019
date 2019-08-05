package com.springmvc.crud.pojo;

public class UserPojo {

	private int id;
	private String user_name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public UserPojo(int id, String user_name, String location) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.location = location;
	}
	
	public UserPojo() {
	
	}
	
	
	
}
