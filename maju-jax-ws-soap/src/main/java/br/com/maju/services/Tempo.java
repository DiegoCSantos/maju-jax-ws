package br.com.maju.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.maju.domain.Estado;
import br.com.maju.domain.Filtro;
import br.com.maju.domain.Municipio;
import br.com.maju.domain.Previsao;
import br.com.maju.domain.Regiao;

@WebService
public interface Tempo {
	 
	 @WebMethod
	 public List<Regiao> listaRegioes();
	 
	 
	 @WebMethod
	 public List<Estado> listaEstados();
	 
	 @WebMethod
	 public List<Municipio> listaMunicipios();
	 
	 public List<Previsao> obtemPrevisao(Filtro filtro);

}
