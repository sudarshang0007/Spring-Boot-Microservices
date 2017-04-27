package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.plm.beans.Employee;

@RestController
public class EmployeeController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(path="/client/{id}", method=RequestMethod.GET , produces={"application/json"})
	public Employee getEmployee(@PathVariable String id){
		System.out.println(id);
		Employee employee= restTemplate.getForObject("http://localhost:2222/employee/"+id, Employee.class);
		return employee;
	}
	
	@RequestMapping(path="/client", method= RequestMethod.POST , consumes={"application/json"})
	public String AddClient(@RequestBody Employee employee){
		
		String msg ="Added";
	
		restTemplate.postForLocation("http://localhost:2222/employee", employee);
		return msg;
	}
	
}
