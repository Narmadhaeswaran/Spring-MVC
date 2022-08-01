package com.Employee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.bean.Employee;
import com.Employee.dao.EmployeeInterface;
import com.Employee.datasource.EmployeeDataSource;





@Repository
public class EmployeeDaoImpl implements EmployeeInterface {

	@Autowired
	private EmployeeDataSource datasource;
	
	
	@Override
	public String addUser(Employee employee) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> getAllUser() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Optional<Employee> getUserById(int employeeid) {
		Employee e=new Employee();
		try {
			Connection connection=datasource.getSQLConnection();
		
			String query="Select * from Employees where EmployeeId="+employeeid;
			Statement stmt=connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.format("|%-10d|",resultSet.getInt("EmployeeID"));
				System.out.format("%-20s|", resultSet.getString("LastName"));
				System.out.format("%-20s|",resultSet.getString("FirstName"));
				System.out.format("%-30s|", resultSet.getString("Address"));
	
				
				e.setEmployeeID(resultSet.getInt("EmployeeID"));
				e.setLastName(resultSet.getString("LastName"));
				e.setFirstName(resultSet.getString("FirstName"));
				e.setAddress(resultSet.getString("Address"));
			
			}
			resultSet.close();
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		return Optional.of(e);
	}

	@Override
	public String deleteUser(int employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateUser(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
