package br.com.maju.business;

import java.util.List;

import br.com.maju.data.dao.MunicipioDAO;
import br.com.maju.domain.Municipio;

public class MunicipioService {
	
	private MunicipioDAO dao;
	
	public MunicipioService(){
		dao = new MunicipioDAO();
	}
	
	
	public List<Municipio> listar(){
		return dao.listar();
	}
	
	
	public Municipio incluir(Municipio municipio) {
		return dao.save(municipio);
	}
	
	public Municipio alterar(Municipio municipio) {
		return dao.update(municipio);
	}
	
	public void excluir(int idMunicipio) {
		Municipio municipio = new Municipio();
		municipio.setId(idMunicipio);
		dao.delete(municipio);
	}

}
