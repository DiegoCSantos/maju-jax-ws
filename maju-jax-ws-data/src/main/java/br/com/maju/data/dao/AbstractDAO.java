package br.com.maju.data.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class AbstractDAO <T>{
	
	

	protected EntityManager getEntityManager() {
		
		EntityManagerFactory factory =new EntityManagerFactory();
		return factory.getEntityManager();
	}
	
	
	public  T save(T entity) {
			
		EntityManager entityManager= getEntityManager();
		 entityManager.getTransaction().begin();
		 entityManager.persist(entity);
		 entityManager.getTransaction().commit();
		 entityManager.flush();
		 return entity;

	}
	
	
	public T update(T entity) {
		
		EntityManager entityManager= getEntityManager();
		 entityManager.getTransaction().begin();
		 entityManager.merge(entity);
		 entityManager.getTransaction().commit();
		 entityManager.flush();
		 return entity;

	}
	
	public void delete(T entity) {
		
		EntityManager entityManager= getEntityManager();
		 entityManager.getTransaction().begin();
		 entityManager.remove(entity);
		 entityManager.getTransaction().commit();
		 entityManager.flush();
	}
	

}
