package com.plm.repository;

import org.springframework.data.repository.CrudRepository;

import com.plm.beans.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
