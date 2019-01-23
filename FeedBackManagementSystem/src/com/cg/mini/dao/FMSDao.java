package com.cg.mini.dao;

import com.cg.mini.exceptions.FMSException;

import com.cg.mini.model.MainModel;

public interface FMSDao {

	boolean validatefields(String username, String password)throws FMSException;

	int addFacultySkill(MainModel mainModel)throws FMSException;

//	int addCourse(MainModel mainModel) throws FMSException;

	int deleteRow(int row) throws FMSException;

}
