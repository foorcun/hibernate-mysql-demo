package com.example.hibernatemysql.hibernatemysqldemo.service;

import java.util.List;

import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;

public interface EmployeeService {
	
List<Employee> get();
	
	Employee get(int id);

	void save(Employee employee);
	
	void delete(int id);

}
