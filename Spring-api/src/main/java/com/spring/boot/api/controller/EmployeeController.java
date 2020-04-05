package com.spring.boot.api.controller;

import java.util.Arrays;
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

import com.spring.boot.api.model.Employees;
import com.spring.boot.api.service.EmployeesService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeesService  employeesService;
	
	@RequestMapping("/emplist")
	public List<Employees> mappingMethod() {	
		
		return employeesService.getAllEmployees();
	}
	
	
	@GetMapping("/emplist/{empId}")
	public Employees mappingMethod(@PathVariable Integer empId) {	
		
		return employeesService.getEmployee(empId);
		
	}
	
	@PostMapping("/emplist")
	 public void mappingMethod(@RequestBody Employees employees) {
	
		employeesService.addEmployee( employees);
		
	}
	
	@PutMapping("/emplist/{empId}")
	public void mappingMethod(@RequestBody Employees employees,@PathVariable Integer empId) {
		
		employeesService.updateEmployee( employees,empId);
		
	}
	
	@DeleteMapping("/emplist/{empId}")
	public void deletemappingMethod(@PathVariable Integer empId) {
		
		employeesService.deleteEmployee(empId);
		
	}
		
}
