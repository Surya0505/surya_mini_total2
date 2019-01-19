package com.cg.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cg.mini.exceptions.FMSException;
import com.cg.mini.model.CourseMasterModel;
import com.cg.mini.model.EmployeeMasterModel;
import com.cg.mini.model.FacultySkillModel;
import com.cg.mini.model.Users;
import com.cg.mini.service.FMSService;
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
		List<EmployeeMasterModel> list1 =new ArrayList<EmployeeMasterModel>();
		List<CourseMasterModel> list2 = new ArrayList<CourseMasterModel>();
		
		
		try {
			statement = connection.prepareStatement(QueryMapper.insertQuery);
			statement.setInt(1, facultySkillModel.getFacultyId());
			statement.setString(2, facultySkillModel.getSkillSet());
			statement.executeUpdate();
			
			statement = connection.prepareStatement(QueryMapper.viewEmployeeQuery);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int employeeID = resultSet.getInt("employee_id");
				String employeeName = resultSet.getString("employee_name");
				EmployeeMasterModel employeeMasterModel = new EmployeeMasterModel();
				employeeMasterModel.setEmployeeId(employeeID);
				employeeMasterModel.setEmployeeName(employeeName);
				list1.add(employeeMasterModel);
				
			}
			
			System.out.println("\n ******Employee Master*****");
			System.out.println("Employee ID"+"     "+ "Employee Name");
			for (EmployeeMasterModel employeeMasterModel : list1) {
				System.out.println(employeeMasterModel.getEmployeeId()+"     "+employeeMasterModel.getEmployeeName());
			}
			
			statement = connection.prepareStatement(QueryMapper.viewCourseQuery);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int courseId = resultSet.getInt("course_id");
				String courseName = resultSet.getString("course_name");
				int noOfDays = resultSet.getInt("no_of_days");
				CourseMasterModel courseMasterModel = new CourseMasterModel();
				courseMasterModel.setCourseId(courseId);
				courseMasterModel.setCourseName(courseName);
				courseMasterModel.setNoOfDays(noOfDays);
				list2.add(courseMasterModel);
				
			}
			
			System.out.println("\n ******Course Master*****");
			System.out.println("Course ID"+"     "+ "Course Name"+"    "+"No of Days");
			for (CourseMasterModel courseMasterModel : list2) {
				System.out.println(courseMasterModel.getCourseId()+"     "+courseMasterModel.getCourseName()+"     "+courseMasterModel.getNoOfDays());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
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
