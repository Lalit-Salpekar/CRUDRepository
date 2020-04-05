package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.model.Employees;

public interface EmployeesService {
	
	public List<Employees> getAllEmployees();
	
	public Employees getEmployee(Integer empId);

	public void addEmployee(Employees employees);

	public void updateEmployee(Employees employees, Integer empId);

	public void deleteEmployee(Integer empId);

}
