package br.com.maju.services;

import java.util.List;

import javax.jws.WebService;

import br.com.maju.domain.Estado;
import br.com.maju.domain.Filtro;
import br.com.maju.domain.Municipio;
import br.com.maju.domain.Previsao;
import br.com.maju.domain.Regiao;

@WebService(endpointInterface="br.com.maju.services.Tempo", name="Tempo")
public class TempoImpl implements Tempo {

	
	public TempoImpl(){
		super();
	}
	
	

	@Override
	public List<Regiao> listaRegioes() {
		return null;
	}

	@Override
	public List<Estado> listaEstados() {
		return null;
	}

	@Override
	public List<Municipio> listaMunicipios() {
		return null;
	}

	@Override
	public List<Previsao> obtemPrevisao(Filtro filtro) {
		return null;
	}
	
	
	
	
	
	

}
