package com.Employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.bean.Employee;
import com.Employee.service.EmployeeService;

@RestController
@RequestMapping("/demo")
public class EmployeeController {

	@Autowired
	EmployeeService userService;
	
	@RequestMapping(value = "emplById", method = RequestMethod.GET)
	public Optional<Employee> getEmployeeById(@RequestParam("employeeid") int employeeid) {
		return userService.getUserById(employeeid);
	}
}
