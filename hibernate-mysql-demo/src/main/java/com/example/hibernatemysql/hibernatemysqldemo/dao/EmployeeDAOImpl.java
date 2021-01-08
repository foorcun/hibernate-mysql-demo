package com.example.hibernatemysql.hibernatemysqldemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.hibernatemysql.hibernatemysqldemo.model.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(employee);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
