package br.com.maju.business;

import java.util.List;

import br.com.maju.data.dao.RegiaoDAO;
import br.com.maju.domain.Regiao;

public class RegiaoService {
	
	private RegiaoDAO dao;
	
	public RegiaoService() {
		dao = new RegiaoDAO();
	}
	
	public List<Regiao> listar(){
		return dao.listar();
	}
	
	public Regiao incluir(Regiao regiao) {
		return dao.save(regiao);
	}
	
	public Regiao alterar(Regiao regiao) {
		return dao.update(regiao);
	}
	
	public void excluir(int  idRegiao) {
		
		Regiao regiao = new Regiao();
		regiao.setId(idRegiao);
		dao.delete(regiao);
	}


}
