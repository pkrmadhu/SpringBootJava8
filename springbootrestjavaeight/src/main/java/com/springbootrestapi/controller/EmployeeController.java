package com.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.model.Employee;
import com.springbootrestapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
        @Autowired
        EmployeeService empService;
        
        @PostMapping("/employee")
        public Employee createEmployee(@RequestBody Employee emp) {
            return empService.createEmployee(emp);
        }
        
        @GetMapping("/employees")
        public List<Employee> readEmployees() {
            return empService.getEmployees();
        }

        @PutMapping("/employees/{empId}")
        public Employee readEmployees(@PathVariable(value = "empId") Integer empId, @RequestBody Employee empDetails) {
            return empService.updateEmployee(empId, empDetails);
        }

        @DeleteMapping("/employees/{empId}")
        public void deleteEmployees(@PathVariable(value = "empId") Integer empId) {
            empService.deleteEmployee(empId);
        }

}