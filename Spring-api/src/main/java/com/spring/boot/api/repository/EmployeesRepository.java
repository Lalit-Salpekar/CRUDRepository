package com.spring.boot.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.api.model.Employees;

public interface EmployeesRepository extends CrudRepository<Employees , Integer> {
}
