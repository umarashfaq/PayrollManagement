package com.umar.payroll.dao;

import org.springframework.stereotype.Repository;

import com.umar.payroll.domain.Salary;

@Repository
public class SalaryDAOJpa extends GenericDAOJpa<Salary> 
	implements SalaryDAO {
	
	@Override
	protected Class<Salary> getPersistentClass() {
		return Salary.class;
	}
}
