package br.com.maju.business;

import java.util.List;

import br.com.maju.data.dao.EstadoDAO;
import br.com.maju.domain.Estado;

public class EstadoService {
	
	private EstadoDAO dao;
	
	public EstadoService(){
		dao= new EstadoDAO();
	}
	
	public List<Estado> listar(){
		return dao.listar();
	}
	
	public Estado incluir(Estado estado) {
		return dao.save(estado);
	}
	
	public Estado alterar(Estado estado) {
		return dao.update(estado);
	}
	
	public void excluir(int idEstado) {
		
		Estado estado = new Estado();
		estado.setId(idEstado);
		dao.delete(estado);
	}

}
