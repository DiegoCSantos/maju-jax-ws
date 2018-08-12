package br.com.maju.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.maju.domain.Regiao;

public class RegiaoDAO extends AbstractDAO<Regiao>{
	
	public List<Regiao> listar(){
		
		EntityManager entityManager = this.getEntityManager();
		List<Regiao> resultList =
		entityManager.createQuery("select r from Regiao r ",Regiao.class)
		 .getResultList();
		
		return resultList;
	}

}
