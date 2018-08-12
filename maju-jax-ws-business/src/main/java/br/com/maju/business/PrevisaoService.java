package br.com.maju.business;

import java.util.List;

import br.com.maju.data.dao.PrevisaoDAO;
import br.com.maju.domain.Previsao;

public class PrevisaoService {
	
	private PrevisaoDAO dao;
	
	public PrevisaoService() {
		dao = new PrevisaoDAO();
	}
	
	public List<Previsao> listar(){
		return dao.listar();
	}
	
	public Previsao incluir(Previsao previsao) {
		return dao.save(previsao);
	}
	
	public Previsao alterar(Previsao previsao) {
		return dao.update(previsao);
	}
	
	public void excluir(int idPrevisao) {
		Previsao previsao = new Previsao();
		previsao.setId(idPrevisao);
		dao.delete(previsao);
	}

}
