package br.com.maju.data.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.maju.domain.Previsao;

public class PrevisaoDAO  extends AbstractDAO<Previsao> {

	public List<Previsao> listar() {
		EntityManager entityManager = this.getEntityManager();
		List<Previsao> resultList =
		entityManager.createQuery("select p from Previsao p",Previsao.class)
		 .getResultList();
		
		return resultList;
	}

}
