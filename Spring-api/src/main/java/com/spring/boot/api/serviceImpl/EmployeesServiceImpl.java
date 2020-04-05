package com.spring.boot.api.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.model.Employees;
import com.spring.boot.api.repository.EmployeesRepository;
import com.spring.boot.api.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	
	@Autowired
	private EmployeesRepository  employeesRepository; 
	
	List<Employees> emplist =new ArrayList<> (Arrays.asList(
			new Employees(10001,"Manish Salpekar" ,10000.0000,"Java"),
			new Employees(10002,"Lalit Salpekar" ,100000.0000,"Python"),
			new Employees(10003,"Vijay Salpekar" ,20000.0000,"Saloon")
			));

	@Override
	public List<Employees> getAllEmployees() {
		
		List<Employees> empList =new ArrayList<>();
		
		employeesRepository.findAll().forEach(empList :: add);
		
		return empList;
	}


	@Override
	public Employees getEmployee(Integer empId) {
		
		
		//emplist.stream().filter(a -> a.getEmpId().equals(empId)).findFirst().get();
	
		return employeesRepository.findById(empId).get();
	}


	@Override
	public void addEmployee(Employees employees) {
		
		//emplist.add(employees);
		
		employeesRepository.save(employees);
	}


	@Override
	public void updateEmployee(Employees employees, Integer empId) {
		
/*		Employees employee =emplist.stream().filter(a -> a.getEmpId().equals(empId)).findFirst().get();		
		int indexNumber = emplist.indexOf(employee);
		emplist.set(indexNumber, employees);*/
		
		
		
		if(employeesRepository.existsById(empId)== true) {
			
			 employeesRepository.save(employees);
			
		}
	}


	@Override
	public void deleteEmployee(Integer empId) {
		
		/*Employees employee =emplist.stream().filter(a -> a.getEmpId().equals(empId)).findFirst().get();
		
		int indexNumber = emplist.indexOf(employee);
		
		emplist.remove(indexNumber);*/
		
		employeesRepository.deleteById(empId);
	
	}

	
}
