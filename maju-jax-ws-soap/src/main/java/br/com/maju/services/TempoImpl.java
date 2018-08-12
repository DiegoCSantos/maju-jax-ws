package br.com.maju.services;

import java.util.List;

import javax.jws.WebService;

import br.com.maju.business.EstadoService;
import br.com.maju.business.MunicipioService;
import br.com.maju.business.PrevisaoService;
import br.com.maju.business.RegiaoService;
import br.com.maju.domain.Estado;
import br.com.maju.domain.Filtro;
import br.com.maju.domain.Municipio;
import br.com.maju.domain.Previsao;
import br.com.maju.domain.Regiao;

@WebService(endpointInterface = "br.com.maju.services.Tempo", name = "Tempo")
public class TempoImpl implements Tempo {

	private RegiaoService regiaoService;
	private EstadoService estadoService;
	private MunicipioService municipioService;
	private PrevisaoService previsaoService;

	public TempoImpl() {
		super();

		regiaoService = new RegiaoService();
		estadoService = new EstadoService();
		municipioService = new MunicipioService();
		previsaoService = new PrevisaoService();
	}

	
	@Override
	public List<Regiao> listaRegioes() {
		return regiaoService.listar();
	}

	@Override
	public List<Estado> listaEstados() {
		return estadoService.listar();
	}

	@Override
	public List<Municipio> listaMunicipios() {
		return municipioService.listar();
	}

	@Override
	public List<Previsao> obtemPrevisao(Filtro filtro) {
		return previsaoService.listar();
	}


	@Override
	public Regiao inserirRegiao(Regiao regiao) {
		return regiaoService.incluir(regiao);
	}


	@Override
	public Regiao alterarRegiao(Regiao regiao) {
		return regiaoService.alterar(regiao);
	}


	@Override
	public void removerRegiao(int idRegiao) {
		regiaoService.excluir(idRegiao);
	}


	@Override
	public Estado inserirEstado(Estado estado) {
		return estadoService.incluir(estado);
	}


	@Override
	public Estado alterarEstado(Estado estado) {
		return estadoService.alterar(estado);
	}


	@Override
	public void removerEstado(int idEstado) {
		estadoService.excluir(idEstado);		
	}


	@Override
	public Municipio inserirMunicipio(Municipio municipio) {
		return municipioService.incluir(municipio);
	}


	@Override
	public Municipio alterarMunicipio(Municipio municipio) {
		return municipioService.alterar(municipio);
	}


	@Override
	public void removerMunicipio(int idMunicipio) {
		municipioService.excluir(idMunicipio);		
	}


	@Override
	public Previsao inserirPrevisao(Previsao previsao) {
		return previsaoService.incluir(previsao);
	}


	@Override
	public Previsao alterarPrevisao(Previsao previsao) {
		return previsaoService.alterar(previsao);
	}


	@Override
	public void removerPrevisao(int idPrevisao) {
		previsaoService.excluir(idPrevisao);
	}

	
	
	
	
	
	
	
}
