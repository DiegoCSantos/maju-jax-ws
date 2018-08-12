package br.com.maju.data.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.maju.domain.Municipio;

public class MunicipioDAO  extends AbstractDAO<Municipio> {
	
	public List<Municipio> listar(){
		EntityManager entityManager = this.getEntityManager();
		List<Municipio> resultList =
		entityManager.createQuery("select m from Municipio m",Municipio.class)
		 .getResultList();
		
		return resultList;
	}
	
}
