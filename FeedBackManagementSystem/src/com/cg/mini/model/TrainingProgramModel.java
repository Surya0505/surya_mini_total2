package com.cg.mini.model;

import java.time.LocalDate;

public class TrainingProgramModel {

	private int trainingCode;
	private int courseCode;
	private int facultyCode;
	private LocalDate startDate;
	private LocalDate endDate;

	public TrainingProgramModel() {
		// TODO Auto-generated constructor stub
	}

	public TrainingProgramModel(int trainingCode, int courseCode,
			int facultyCode, LocalDate startDate, LocalDate endDate) {
		super();
		this.trainingCode = trainingCode;
		this.courseCode = courseCode;
		this.facultyCode = facultyCode;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
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

}
