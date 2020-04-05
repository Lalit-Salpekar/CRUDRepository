package com.spring.boot.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	
	@Id
	private Integer empId;	
	private String empName;
	private Double empSalary;
	private String empSkills;
		
	public Employees() {
		super();
	}
	
	
	public Employees(Integer empId, String empName, Double empSalary, String empSkills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empSkills = empSkills;
	}


	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(String empSkills) {
		this.empSkills = empSkills;
	}
	
	

}
