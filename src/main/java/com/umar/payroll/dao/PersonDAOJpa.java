package com.umar.payroll.dao;

import org.springframework.stereotype.Repository;

import com.umar.payroll.domain.Person;

@Repository
public class PersonDAOJpa extends GenericDAOJpa<Person> 
	implements PersonDAO {
	
	@Override
	protected Class<Person> getPersistentClass() {
		return Person.class;
	}
}
