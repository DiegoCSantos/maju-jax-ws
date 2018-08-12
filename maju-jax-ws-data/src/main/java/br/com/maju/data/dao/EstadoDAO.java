package br.com.maju.data.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.maju.domain.Estado;

public class EstadoDAO  extends AbstractDAO<Estado>{
	
	public List<Estado> listar(){
		EntityManager entityManager = this.getEntityManager();
		List<Estado> resultList =
		entityManager.createQuery("select e from Estado e",Estado.class)
		 .getResultList();
		
		return resultList;
	}

}
