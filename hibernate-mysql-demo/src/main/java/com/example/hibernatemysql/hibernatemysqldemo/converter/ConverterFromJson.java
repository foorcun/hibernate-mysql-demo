package com.example.hibernatemysql.hibernatemysqldemo.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hibernatemysql.hibernatemysqldemo.dao.EmployeeDAO;
import com.example.hibernatemysql.hibernatemysqldemo.dao.JsonEmployeeDAO;
import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;
import com.example.hibernatemysql.hibernatemysqldemo.service.EmployeeService;

public class ConverterFromJson {

	
	
//input
	private EmployeeDAO jsonVeren = new  JsonEmployeeDAO();

//	hedef
	EmployeeService employeeService;
//	@Autowired
//	private IKelimeDal veriAlan;

	
	
	public ConverterFromJson(EmployeeService employeeService) {
		this.employeeService =  employeeService;
	}
	
	
	


	public void convertToHedef() {
		
		List<Employee> alinanE = jsonVeren.get();
		
		for(int i=0; i<alinanE.size();i++ ) {
			
			try {
				  //  Block of code to try
				this.employeeService.save(alinanE.get(i));
				}
				catch(Exception e) {
				  //  Block of code to handle errors
				}
			
		}
		
		
	};
	
	
	
}
