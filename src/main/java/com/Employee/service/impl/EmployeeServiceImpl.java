package com.Employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.bean.Employee;
import com.Employee.dao.EmployeeInterface;
import com.Employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeInterface userInterface;
	
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
		
		return userInterface.getUserById(employeeid);
	}

	@Override
	public String deleteUser(int employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
