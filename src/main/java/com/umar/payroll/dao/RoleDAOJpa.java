package com.umar.payroll.dao;

import org.springframework.stereotype.Repository;

import com.umar.payroll.domain.Role;

@Repository
public class RoleDAOJpa extends GenericDAOJpa<Role> 
	implements RoleDAO {
	@Override
	protected Class<Role> getPersistentClass() {
		return Role.class;
	}
}
