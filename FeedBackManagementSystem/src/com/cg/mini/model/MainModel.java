package com.cg.mini.model;

import java.time.LocalDate;

public class MainModel {
	
	private int courseId;
	private String courseName;
	private int noOfDays;
	
	private int employeeId;
	private String employeeName;
	private String password;
	private String role;
	
	private int facultyId;
	private String skillSet;
	
	private int trainingCode;
	private int participantId;
	private int fbPrscomm;
	private int fbClrfydbts;
	private int fbTm;
	private int fbHndOut;
	private int fbHwSwNtwrk;
	private String comments;
	private String suggestions;
	
	private int courseCode;
	private int facultyCode;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private String username;
	
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + "]";
	}
	
	public MainModel() {
		// TODO Auto-generated constructor stub
	}

	public MainModel(int courseId, String courseName, int noOfDays, int employeeId, String employeeName,
			String password, String role, int facultyId, String skillSet, int trainingCode, int participantId,
			int fbPrscomm, int fbClrfydbts, int fbTm, int fbHndOut, int fbHwSwNtwrk, String comments,
			String suggestions, int courseCode, int facultyCode, LocalDate startDate, LocalDate endDate,
			String username) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.noOfDays = noOfDays;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.role = role;
		this.facultyId = facultyId;
		this.skillSet = skillSet;
		this.trainingCode = trainingCode;
		this.participantId = participantId;
		this.fbPrscomm = fbPrscomm;
		this.fbClrfydbts = fbClrfydbts;
		this.fbTm = fbTm;
		this.fbHndOut = fbHndOut;
		this.fbHwSwNtwrk = fbHwSwNtwrk;
		this.comments = comments;
		this.suggestions = suggestions;
		this.courseCode = courseCode;
		this.facultyCode = facultyCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.username = username;
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

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public int getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public int getFbPrscomm() {
		return fbPrscomm;
	}

	public void setFbPrscomm(int fbPrscomm) {
		this.fbPrscomm = fbPrscomm;
	}

	public int getFbClrfydbts() {
		return fbClrfydbts;
	}

	public void setFbClrfydbts(int fbClrfydbts) {
		this.fbClrfydbts = fbClrfydbts;
	}

	public int getFbTm() {
		return fbTm;
	}

	public void setFbTm(int fbTm) {
		this.fbTm = fbTm;
	}

	public int getFbHndOut() {
		return fbHndOut;
	}

	public void setFbHndOut(int fbHndOut) {
		this.fbHndOut = fbHndOut;
	}

	public int getFbHwSwNtwrk() {
		return fbHwSwNtwrk;
	}

	public void setFbHwSwNtwrk(int fbHwSwNtwrk) {
		this.fbHwSwNtwrk = fbHwSwNtwrk;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public int getFacultyCode() {
		return facultyCode;
	}

	public void setFacultyCode(int facultyCode) {
		this.facultyCode = facultyCode;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
