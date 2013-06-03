package com.umar.payroll.service;

import java.util.List;

import com.umar.payroll.domain.Person;

public interface PersonService {
	public List<Person> list();
	public Person persist(Person person);
	public Person merge(Person person);
	public Person findById(int id);
	public void delete(int id);
}
