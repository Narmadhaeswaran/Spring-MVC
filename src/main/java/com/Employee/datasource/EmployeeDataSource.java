package com.Employee.datasource;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.stereotype.Component;

@Component("dataSource")
public class EmployeeDataSource {

	
	public java.sql.Connection getSQLConnection() throws SQLException, ClassNotFoundException, NamingException {
		java.sql.Connection connection = null;
		try {
			Context ctx = new InitialContext();
			javax.sql.DataSource dataSource = (javax.sql.DataSource) ctx.lookup("java:jboss/datasources/samplejdbcSQLDS");
			connection = dataSource.getConnection();
			DatabaseMetaData dmd = connection.getMetaData();
			String url = dmd.getURL();
			System.out.println("Conn Properties SQL !" + url ); 
			if (connection != null) {
				System.out.println("Connected to db!");
			} 
			return connection;
			}
			catch (SQLException ex) {
			return null;
			}
			}

	
}
