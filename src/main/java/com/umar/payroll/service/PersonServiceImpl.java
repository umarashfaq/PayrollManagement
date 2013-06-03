package com.umar.payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umar.payroll.dao.PersonDAO;
import com.umar.payroll.domain.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDAO personDAO;
	
	@Override
	public List<Person> list() {
		return personDAO.findAll();
	}
	
	@Override
	public Person persist(Person person) {
		personDAO.persist(person);
		return person;
	}
	
	@Override
	public Person merge(Person person) {
		personDAO.merge(person);
		return person;
	}
	
	@Override
	public Person findById(int id) {
		return personDAO.findById(id);
	}
	
	@Override
	public void delete(int id) {
		personDAO.delete(personDAO.findById(id));
	}
}
