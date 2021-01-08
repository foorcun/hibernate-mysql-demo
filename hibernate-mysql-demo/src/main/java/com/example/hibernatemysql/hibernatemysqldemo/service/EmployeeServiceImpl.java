package com.example.hibernatemysql.hibernatemysqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernatemysql.hibernatemysqldemo.dao.EmployeeDAO;
import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Override
	@Transactional
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
