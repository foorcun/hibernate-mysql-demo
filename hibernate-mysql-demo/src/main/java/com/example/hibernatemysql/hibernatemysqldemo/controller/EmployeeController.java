package com.example.hibernatemysql.hibernatemysqldemo.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemysql.hibernatemysqldemo.converter.ConverterFromJson;
import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;
import com.example.hibernatemysql.hibernatemysqldemo.service.EmployeeService;

@RestController
@RequestMapping("api/")
public class EmployeeController {

	
	
	
	
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("employee")
	public List<Employee> getKelimes() throws FileNotFoundException, IOException{
		
		/////convert başlangıç
//		ConverterFromJson conv = new ConverterFromJson(employeeService);
//		conv.convertToHedef();
		////convert bitiş
		
		
		
		
		
		return employeeService.get();
		//return this.kelimeRepository.findAll();
//		return this.kelimeDal.findAll();
//		return this.kelimeDal.getAll();
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employeeObj) {
		employeeService.save(employeeObj);
		return employeeObj;
		
	}

}
