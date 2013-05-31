package com.umar.payroll.dao;

import java.util.List;

import com.umar.payroll.domain.Department;

public interface DepartmentDAO extends GenericDAO<Department> {
	List<Department> findExpensiveDepartments();
}
