package com.cg.mini.model;

public class FacultySkillModel {
	
	private int facultyId;
	private String skillSet;
	
	public FacultySkillModel() {
		// TODO Auto-generated constructor stub
	}

	public FacultySkillModel(int facultyId, String skillSet) {
		super();
		this.facultyId = facultyId;
		this.skillSet = skillSet;
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
	
	

}
