package com.cg.mini.dao;

public interface QueryMapper {

	public static final String checkQuery = "select User_Name from users where User_Name=? and password=?";
	public static final String insertQuery = "insert into Faculty_Skill values (?,?)";
	public static final String viewEmployeeQuery = "select e.employee_id,e.employee_name,f.* from employee_master e, faculty_skill f where e.employee_id=f.faculty_id";
	public static final String viewCourseQuery = "select * from course_master";
	public static final String insertCourse = "insert into Course_Master values (?,?,?)";
	public static final String deleteRow = "delete course_master where course_id=?";
	public static final String viewCourse = "select * from course_master";
	
}
