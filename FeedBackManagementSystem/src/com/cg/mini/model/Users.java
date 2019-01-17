package com.cg.mini.model;

public class Users {
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + "]";
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username2) {
		this.username = username2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
