package com.plm.dao;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plm.beans.Role;
import com.plm.repository.RoleRepository;

@Service
public class RoleDao  {
	
	@Autowired
	private RoleRepository roleRepo;
	
	//public getAllRoles
	public Set<Role> FindAllRoles(){
		return (Set<Role>) roleRepo.findAll();
	}


}
