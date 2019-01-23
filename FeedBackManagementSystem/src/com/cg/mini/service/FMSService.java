package com.cg.mini.service;

import com.cg.mini.exceptions.FMSException;

import com.cg.mini.model.MainModel;

public interface FMSService {

	boolean validateFields(String username, String password) throws FMSException;

	boolean validation(int facultyId) throws FMSException;

	int addFacultySkill(MainModel mainModel) throws FMSException;

//	int addCourse(MainModel mainModel)throws FMSException;

	int deleteRow(int row) throws FMSException;

	


}
