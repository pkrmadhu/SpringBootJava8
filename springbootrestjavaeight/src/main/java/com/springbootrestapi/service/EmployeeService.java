package com.springbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.dao.EmployeeDataRepository;
import com.springbootrestapi.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDataRepository edr;

	public List<Employee> getAllEmployees() {
		
		return edr.findAll();
	}
	
	

}
