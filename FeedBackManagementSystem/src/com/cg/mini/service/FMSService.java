package com.cg.mini.service;

import com.cg.mini.exceptions.FMSException;
import com.cg.mini.model.FacultySkillModel;

public interface FMSService {

	boolean validateFields(String username, String password) throws FMSException;

	boolean validation(int facultyId) throws FMSException;

	int addFacultySkillModel(FacultySkillModel facultySkillModel) throws FMSException;


}
