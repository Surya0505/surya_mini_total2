package com.cg.mini.model;

public class EmployeeMasterModel {
	
	private int employeeId;
	private String employeeName;
	private String password;
	private String role;
	
	public EmployeeMasterModel() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeMasterModel(int employeeId, String employeeName,
			String password, String role) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.role = role;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
