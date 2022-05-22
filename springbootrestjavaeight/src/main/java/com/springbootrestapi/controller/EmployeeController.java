package com.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.model.Employee;
import com.springbootrestapi.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService es ;
	
	@GetMapping("/allEmployees")
	//public List<Employee> getAllEmployees() {
	public String getAllEmployees() {
		return "All Employee Details";
		
		//return es.getAllEmployees();
	}

}
