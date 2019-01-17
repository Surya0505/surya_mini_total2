package com.cg.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cg.mini.exceptions.FMSException;
import com.cg.mini.model.FacultySkillModel;
import com.cg.mini.model.Users;
import com.cg.mini.utility.JDBCUtility;

public class FMSDaoImpl implements FMSDao {
	
	PreparedStatement statement = null;
	Connection connection = null;
	ResultSet resultSet = null;
	
	static Logger logger = Logger.getLogger(FMSDaoImpl.class);
	
	@Override
	public boolean validatefields(String username, String password) throws FMSException {
		List<Users> list= new ArrayList<>();
		connection = JDBCUtility.getConnection();
		boolean flag = false;
		try {
			statement = connection.prepareStatement(QueryMapper.checkQuery);
			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				String user = resultSet.getString(1);
				Users users = new Users();
				users.setUsername(user);
				list.add(users);
			}
			if (list.isEmpty()) {
				flag = false;
			}else {
				flag=true;
			}
		} catch (Exception e) {
			throw new FMSException("No data found");
		}
				
		return flag;
	}
	
	@Override
	public int addFacultySkillModel(FacultySkillModel facultySkillModel) throws FMSException {
		//List<FacultySkillModel> list = new ArrayList<FacultySkillModel>();
		connection = JDBCUtility.getConnection();
		//boolean flag = false;
		
		try {
			statement = connection.prepareStatement(QueryMapper.insertQuery);
			statement.setInt(1, facultySkillModel.getFacultyId());
			statement.setString(2, facultySkillModel.getSkillSet());
			resultSet = statement.executeQuery();
			resultSet.next();
		} catch (SQLException e) {
			throw new FMSException("Error occured");
		} finally {
			logger.info("in finally block");
			try {
				resultSet.close();
				logger.info("resultset closed");
			} catch (SQLException e) {
				logger.error(e.getMessage());
				throw new FMSException("problem occured while closing resultset");
			}
			try {
				statement.close();
				logger.info("statement closed");
			} catch (SQLException e) {
				logger.error(e.getMessage());
				throw new FMSException("problem occured while closing statement");
			}
			try {
				connection.close();
				logger.info("connection closed");
			} catch (SQLException e) {
				logger.error(e.getMessage());
				throw new FMSException("problem occured while closing connection");
			}
		}
		return 1;
		
		
	
	}

}
