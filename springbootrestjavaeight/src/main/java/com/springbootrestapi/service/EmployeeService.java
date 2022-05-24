package com.springbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.dao.EmployeeRepository;
import com.springbootrestapi.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	// CREATE 
	public Employee createEmployee(Employee emp) {
	    return empRepository.save(emp);
	}

	// READ
	public List<Employee> getEmployees() {
	    return empRepository.findAll();
	}

	// DELETE
	public void deleteEmployee(Integer empId) {
	    empRepository.deleteById(empId);
	}
	
	// UPDATE
	public Employee updateEmployee(Integer empId, Employee employeeDetails) {
	        Employee emp = empRepository.findById(empId).get();
	        emp.setName(employeeDetails.getName());
	        emp.setSalary(employeeDetails.getSalary());
	        emp.setJob(employeeDetails.getJob());
	        emp.setAge(employeeDetails.getAge());
	        emp.setGender(employeeDetails.getGender());
	        emp.setLocation(employeeDetails.getLocation());
	        
	        return empRepository.save(emp);                                
	}
	

}
