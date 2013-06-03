package com.umar.payroll.dao;

import java.util.List;

public interface GenericDAO<T> {
	T findById(int id);
	List<T> findAll();
	void persist(T entity);
	void merge(T entity);
	void delete(T entity);
}
