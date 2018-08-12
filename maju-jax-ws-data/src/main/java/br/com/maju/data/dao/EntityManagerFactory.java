package br.com.maju.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {
	
	public EntityManager getEntityManager() {
		
		javax.persistence.EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("persistence-unit");
		return factory.createEntityManager();
	}

}
