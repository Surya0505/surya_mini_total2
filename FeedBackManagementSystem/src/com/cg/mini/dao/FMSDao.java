package com.cg.mini.dao;

import com.cg.mini.exceptions.FMSException;
import com.cg.mini.model.FacultySkillModel;

public interface FMSDao {

	boolean validatefields(String username, String password)throws FMSException;

	int addFacultySkillModel(FacultySkillModel facultySkillModel)throws FMSException;

}
