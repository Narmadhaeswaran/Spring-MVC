package com.Employee.dao;

import java.util.List;
import java.util.Optional;

import com.Employee.bean.Employee;

public interface EmployeeInterface {

	public String addUser(Employee employee);
	
	public List<Employee> getAllUser();
	
	public Optional<Employee> getUserById(int employeeid);
	
	public String deleteUser(int employeeid);
	
	public Employee updateUser(Employee employee);
}
