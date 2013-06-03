package com.umar.payroll.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDAOJpa<T> implements GenericDAO<T> {
	
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public T findById(int id) {
		return em.find(this.getPersistentClass(), id);
	}

	@Override
	public List<T> findAll() {
		Class<T> clazz = this.getPersistentClass();
		return em.createQuery("select d from "+clazz.getName()+" d")
				.getResultList();
	}

	@Override
	public void persist(T entity) {
		em.persist(entity);
	}

	@Override
	public void merge(T entity) {
		em.merge(entity);
	}
	
	@Override
	public void delete(T entity) {
		em.remove(entity);
	}
	
	protected abstract Class<T> getPersistentClass();

}
