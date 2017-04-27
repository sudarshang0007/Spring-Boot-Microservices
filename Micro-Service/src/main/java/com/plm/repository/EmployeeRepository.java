package com.plm.repository;

import org.springframework.data.repository.CrudRepository;

import com.plm.beans.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
