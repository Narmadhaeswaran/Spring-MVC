package com.Employee.service;

import java.util.List;
import java.util.Optional;

import com.Employee.bean.Employee;

public interface EmployeeService {

	public String addUser(Employee employee);
	
	public List<Employee> getAllUser();
	
	public Optional<Employee> getUserById(int employeeid);
	
	public String deleteUser(int employeeid);
	
	public Employee update(Employee employee);
}
