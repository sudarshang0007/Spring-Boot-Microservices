package com.plm.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plm.beans.Employee;
import com.plm.repository.EmployeeRepository;

@Component
public class EmployeeDao {

	@Autowired
	EmployeeRepository repository;	

	//Create
	public void saveEmployee(Employee employee) {
		repository.save(employee);
	}
	//Read
	public List<Employee> getAllEmployee(){
		return ( List<Employee> ) repository.findAll();
	}

	//Search BY Id
	//Find one Employee
	public Employee findEmployee(Integer empid) {
		return repository.findOne(empid);
	}

	//Update

	//Delete




}
