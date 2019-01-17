package com.cg.mini.dao;

public interface QueryMapper {
	
	public static final String checkQuery = "select User_Name from users where User_Name=? and password=?";
	public static final String insertQuery = "insert into Faculty_Skill values (?,?)";
}
