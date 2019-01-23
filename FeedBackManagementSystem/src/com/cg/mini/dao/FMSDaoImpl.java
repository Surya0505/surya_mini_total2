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
import com.cg.mini.model.MainModel;
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
		List<MainModel> list = new ArrayList<>();
		connection = JDBCUtility.getConnection();
		boolean flag = false;
		try {
			statement = connection.prepareStatement(QueryMapper.checkQuery);
			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String user = resultSet.getString(1);
				MainModel mainModel = new MainModel();
				mainModel.setUsername(user);
				list.add(mainModel);
			}
			if (list.isEmpty()) {
				flag = false;
			} else {
				flag = true;
			}
		} catch (Exception e) {
			throw new FMSException("No data found");
		}

		return flag;
	}

	@Override
	public int addFacultySkill(MainModel mainModel) throws FMSException {
		// List<FacultySkillModel> list = new ArrayList<FacultySkillModel>();
		connection = JDBCUtility.getConnection();
		// boolean flag = false;
		List<MainModel> list1 = new ArrayList<>();
		List<MainModel> list2 = new ArrayList<>();

		try {
			statement = connection.prepareStatement(QueryMapper.insertQuery);
			statement.setInt(1, mainModel.getFacultyId());
			statement.setString(2, mainModel.getSkillSet());
			statement.executeUpdate();

			statement = connection.prepareStatement(QueryMapper.viewEmployeeQuery);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int employeeID = resultSet.getInt("employee_id");
				String employeeName = resultSet.getString("employee_name");
				String skillSet = resultSet.getString("skill_set");
				MainModel mainModel1 = new MainModel();
				mainModel1.setEmployeeId(employeeID);
				mainModel1.setEmployeeName(employeeName);
				mainModel1.setSkillSet(skillSet);
				list1.add(mainModel1);

			}

			System.out.println("\n ******Employee Master*****");
			System.out.println("Employee ID" + "     " + "Employee Name" + "     " + "Skill Set");
			for (MainModel mainModel1 : list1) {
				System.out.println(mainModel1.getEmployeeId() + "         " + mainModel1.getEmployeeName() + "        "
						+ mainModel1.getSkillSet());
			}

			statement = connection.prepareStatement(QueryMapper.viewCourseQuery);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int courseId = resultSet.getInt("course_id");
				String courseName = resultSet.getString("course_name");
				int noOfDays = resultSet.getInt("no_of_days");
				MainModel mainModel1 = new MainModel();
				mainModel1.setCourseId(courseId);
				mainModel1.setCourseName(courseName);
				mainModel1.setNoOfDays(noOfDays);
				list2.add(mainModel1);

			}

			System.out.println("\n ******Course Master*****");
			System.out.println("Course ID" + "     " + "Course Name" + "    " + "No of Days");
			for (MainModel mainModel1 : list2) {
				System.out.println(mainModel1.getCourseId() + "     " + mainModel1.getCourseName() + "     "
						+ mainModel1.getNoOfDays());
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

/*	@Override
	public int addCourse(MainModel mainModel) throws FMSException {
		List<MainModel> list = new ArrayList<>();
		try {
			
			statement = connection.prepareStatement(QueryMapper.insertCourse);
			resultSet = statement.executeQuery();
			
			statement = connection.prepareStatement(QueryMapper.viewCourse);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int courseId = resultSet.getInt("course_id");
				String courseName = resultSet.getString("course_name");
				int noOfDays = resultSet.getInt("no_of_days");
				MainModel mainModel1 = new MainModel();
				mainModel1.setCourseId(courseId);
				mainModel1.setCourseName(courseName);
				mainModel1.setNoOfDays(noOfDays);
				list.add(mainModel1);

			}
			
			System.out.println("\n ******Course Master*****");
			System.out.println("Course ID" + "     " + "Course Name" + "    " + "No of Days");
			for (MainModel mainModel1 : list) {
				System.out.println(mainModel1.getCourseId() + "     " + mainModel1.getCourseName() + "     "
						+ mainModel1.getNoOfDays());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	}*/

	@Override
	public int deleteRow(int row) throws FMSException {
		List<MainModel> list = new ArrayList<>();
		int flag=0,output=0;
		try {
			System.out.println("111111111");
			statement=connection.prepareStatement(QueryMapper.deleteRow);
			System.out.println("22222222222222");
			statement.setInt(1, row);
			System.out.println("333333333");
			output=statement.executeUpdate();
			System.out.println("444444444");
			
		/*	while (resultSet.next()) {
				int courseId = resultSet.getInt(1);
				MainModel mainModel = new MainModel();
				mainModel.setCourseId(courseId);
				list.add(mainModel);
			}*/
			
		/*	if (list.isEmpty()) {
				flag = 0;
			} else {
				flag = 1;
			}*/
			
			statement = connection.prepareStatement(QueryMapper.viewCourse);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int courseId = resultSet.getInt("course_id");
				String courseName = resultSet.getString("course_name");
				int noOfDays = resultSet.getInt("no_of_days");
				MainModel mainModel1 = new MainModel();
				mainModel1.setCourseId(courseId);
				mainModel1.setCourseName(courseName);
				mainModel1.setNoOfDays(noOfDays);
				list.add(mainModel1);

			}
			
			System.out.println("\n ******Course Master*****");
			System.out.println("Course ID" + "     " + "Course Name" + "    " + "No of Days");
			for (MainModel mainModel1 : list) {
				System.out.println(mainModel1.getCourseId() + "     " + mainModel1.getCourseName() + "     "
						+ mainModel1.getNoOfDays());
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error occured");
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
		
		
		return output;
	}

}
