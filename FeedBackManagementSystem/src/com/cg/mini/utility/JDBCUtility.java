package com.cg.mini.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.mini.exceptions.FMSException;

public class JDBCUtility {
	static Connection connection = null;
	public static Connection getConnection() throws FMSException{
		
		File file =null;
		FileInputStream inputStream = null;
		Properties properties = null;
		file=new File("resources/jdbc.properties");
		
		try {
			inputStream = new FileInputStream(file);

			properties = new Properties();
			properties.load(inputStream);

			String driver = properties.getProperty("db.driver");
			String url = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);

		} catch (FileNotFoundException e) {
			throw new FMSException("File not exist");
		} catch (IOException e) {
			throw new FMSException("unable to read the file");
		} catch (ClassNotFoundException e) {
			throw new FMSException("class not loaded");
		} catch (SQLException e) {
			throw new FMSException("not connected to database");
		}
		return connection;
		
	}

}
