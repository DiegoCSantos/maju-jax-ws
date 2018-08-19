package br.com.maju.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import br.com.maju.domain.Estado;
import br.com.maju.domain.Filtro;
import br.com.maju.domain.Municipio;
import br.com.maju.domain.Previsao;
import br.com.maju.domain.Regiao;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
use=SOAPBinding.Use.LITERAL,
parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface Tempo {
	 
	 @WebMethod(action="listaRegioes")
	 public List<Regiao> listaRegioes();
	 
	 
	 @WebMethod(action="inserirRegiao")
	 public Regiao inserirRegiao(@WebParam(name="Regiao", targetNamespace="") Regiao regiao);
	 
	 @WebMethod(action="alterarRegiao")
	 public Regiao alterarRegiao(@WebParam(name="Regiao", targetNamespace="")Regiao regiao);
	 
	 @WebMethod(action="removerRegiao")
	 public void removerRegiao(@WebParam(name="idRegiao", targetNamespace="")  int idRegiao);
	 
	 
	 @WebMethod(action="listaEstados")
	 public List<Estado> listaEstados();
	 
	 @WebMethod(action="inserirEstado")
	 public Estado inserirEstado(@WebParam(name="Estado", targetNamespace="")Estado estado);
	 
	 @WebMethod(action="alterarEstado")
	 public Estado alterarEstado(@WebParam(name="Estado", targetNamespace="")Estado estado);
	 
	 @WebMethod(action="removerEstado")
	 public void removerEstado(@WebParam(name="idEstado", targetNamespace="")int idEstado);
	 
	 @WebMethod(action="listaMunicipios")
	 public List<Municipio> listaMunicipios();
	 
	 @WebMethod(action="inserirMunicipio")
	 public Municipio inserirMunicipio(@WebParam(name="Municipio", targetNamespace="") Municipio municipio);
	 
	 @WebMethod(action="alterarMunicipio")
	 public Municipio alterarMunicipio(@WebParam(name="Municipio", targetNamespace="")Municipio municipio);
	 
	 
	 @WebMethod(action="removerMunicipio")
	 public void removerMunicipio(@WebParam(name="idMunicipio", targetNamespace="") int idMunicipio);
	 
	 @WebMethod(action="obtemPrevisao")
	 public List<Previsao> obtemPrevisao(@WebParam(name="Filtro", targetNamespace="")Filtro filtro);
	 
	 @WebMethod(action="inserirPrevisao")
	 public Previsao inserirPrevisao(@WebParam(name="Previsao", targetNamespace="")Previsao previsao);
	 
	 @WebMethod(action="alterarPrevisao")
	 public Previsao alterarPrevisao(@WebParam(name="Previsao", targetNamespace="")Previsao previsao);
	 
	 @WebMethod(action="removerPrevisao")
	 public void removerPrevisao(@WebParam(name="idPrevisao", targetNamespace="") int idPrevisao);

}
