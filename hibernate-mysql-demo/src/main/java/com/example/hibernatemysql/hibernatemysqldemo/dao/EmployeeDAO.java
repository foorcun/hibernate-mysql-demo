package com.example.hibernatemysql.hibernatemysqldemo.dao;

import java.util.List;

import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get(); // getAll
	
	Employee get(int id); // getById

	void save(Employee employee); //add 
	
	void delete(int id); // delete
}

