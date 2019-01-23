package com.cg.mini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.mini.dao.FMSDao;
import com.cg.mini.dao.FMSDaoImpl;
import com.cg.mini.exceptions.FMSException;

import com.cg.mini.model.MainModel;

public class FMSServiceImpl implements FMSService {

	FMSDao fmsdao = new FMSDaoImpl();
	List<String> list = new ArrayList<>();

	@Override
	public boolean validateFields(String username, String password) throws FMSException {
		// TODO Auto-generated method stub
		return fmsdao.validatefields(username, password);
	}

	@Override
	public boolean validation(int facultyId) throws FMSException {
		String facultyIdRegEx = "[0-9]{5}$";
		boolean validate = Pattern.matches(facultyIdRegEx, String.valueOf(facultyId));
		if (!validate) {
			list.add("faculty Id consists of 5 digits only..");
		}
		return validate;
	}

	@Override
	public int addFacultySkill(MainModel mainModel) throws FMSException {
		// TODO Auto-generated method stub
		return fmsdao.addFacultySkill(mainModel);
	}

/*	@Override
	public int addCourse(MainModel mainModel) throws FMSException {
		// TODO Auto-generated method stub
		return fmsdao.addCourse(mainModel);
	}*/

	@Override
	public int deleteRow(int row) throws FMSException {
		// TODO Auto-generated method stub
		return fmsdao.deleteRow(row);
	}

}
