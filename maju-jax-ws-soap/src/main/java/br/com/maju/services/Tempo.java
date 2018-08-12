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
	 public Regiao inserirRegiao(Regiao regiao);
	 
	 @WebMethod
	 public Regiao alterarRegiao(Regiao regiao);
	 
	 @WebMethod
	 public void removerRegiao(int idRegiao);
	 
	 
	 @WebMethod
	 public List<Estado> listaEstados();
	 
	 @WebMethod
	 public Estado inserirEstado(Estado estado);
	 
	 @WebMethod
	 public Estado alterarEstado(Estado estado);
	 
	 @WebMethod
	 public void removerEstado(int idEstado);
	 
	 @WebMethod
	 public List<Municipio> listaMunicipios();
	 
	 @WebMethod
	 public Municipio inserirMunicipio(Municipio municipio);
	 
	 @WebMethod
	 public Municipio alterarMunicipio(Municipio municipio);
	 
	 public void removerMunicipio(int idMunicipio);
	 
	 @WebMethod
	 public List<Previsao> obtemPrevisao(Filtro filtro);
	 
	 @WebMethod
	 public Previsao inserirPrevisao(Previsao previsao);
	 
	 @WebMethod
	 public Previsao alterarPrevisao(Previsao previsao);
	 
	 @WebMethod
	 public void removerPrevisao(int idPrevisao);

}
