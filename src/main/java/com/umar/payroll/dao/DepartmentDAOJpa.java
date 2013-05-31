package com.umar.payroll.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.umar.payroll.domain.Department;

@Repository
public class DepartmentDAOJpa extends GenericDAOJpa<Department> implements DepartmentDAO {

	@Override
	public List<Department> findExpensiveDepartments() {
		return null;
	}
	
	@Override
	protected Class<Department> getPersistentClass() {
		return Department.class;
	}
}
