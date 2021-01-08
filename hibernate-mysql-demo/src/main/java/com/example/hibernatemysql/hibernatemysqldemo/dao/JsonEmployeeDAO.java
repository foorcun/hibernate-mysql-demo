package com.example.hibernatemysql.hibernatemysqldemo.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;


public class JsonEmployeeDAO implements EmployeeDAO {

	
	
	
	
	
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		//link: https://www.youtube.com/watch?v=_vdiWUDbruw&ab_channel=BrandanJones
		
		// kelime list
		List<Employee> employees = new ArrayList<Employee>();

		//raw json
		//FileReader reader = new FileReader(".\\jsonFiles\\JsonKelimeler.json");
		FileReader reader;
		try {
			reader = new FileReader(".\\src\\main\\resources\\jsonFiles\\JsonEmployee.json");
			
			//json array
			JSONParser jsonparser = new JSONParser();
			Object obj;
			try {
				obj = jsonparser.parse(reader);
				
				JSONArray keljsonobjArr = (JSONArray)obj;
				
				
				//for
				
				for(int i = 0; i<  keljsonobjArr.size(); i++) {
				
				//jsonObject
				JSONObject jsonKelime =  (JSONObject) keljsonobjArr.get(i);
				// klasımız
				Employee employee = new Employee();		
				//data get id,.....
				String id = (String) jsonKelime.get("id");
				String name = (String) jsonKelime.get("name");
//				String eng = (String) jsonKelime.get("eng");
//				String tr = (String) jsonKelime.get("tr");
//				String acıklama = (String) jsonKelime.get("acıklama");
//				String puan = (String) jsonKelime.get("puan");
				
				//data set id,....
				employee.setId(Integer.parseInt(id));
				employee.setName(name);
//				employee.setEng(eng);
//				employee.setTr(tr);
//				employee.setAcıklama(acıklama);
//				employee.setPuan(puan);
				
				
				
				//kelime listesine add
				employees.add(employee);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return employees;
	}

	
	
	
	
	
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
