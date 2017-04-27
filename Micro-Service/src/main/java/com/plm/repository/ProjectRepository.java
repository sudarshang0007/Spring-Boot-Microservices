package com.plm.repository;

import org.springframework.data.repository.CrudRepository;

import com.plm.beans.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
}
