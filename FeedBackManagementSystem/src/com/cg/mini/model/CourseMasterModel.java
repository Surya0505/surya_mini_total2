package com.cg.mini.model;

public class CourseMasterModel {
	
	private int courseId;
	private String courseName;
	private int noOfDays;
	
	public CourseMasterModel() {
		// TODO Auto-generated constructor stub
	}

	public CourseMasterModel(int courseId, String courseName, int noOfDays) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.noOfDays = noOfDays;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	

}
