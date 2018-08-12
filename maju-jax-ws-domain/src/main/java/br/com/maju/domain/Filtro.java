package br.com.maju.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class Filtro {
	
	private String tipoFiltro;
	private String valorFiltro;
	private String agrupamento;
	
	
	
	
	public String getTipoFiltro() {
		return tipoFiltro;
	}
	public void setTipoFiltro(String tipoFiltro) {
		this.tipoFiltro = tipoFiltro;
	}
	public String getValorFiltro() {
		return valorFiltro;
	}
	public void setValorFiltro(String valorFiltro) {
		this.valorFiltro = valorFiltro;
	}
	public String getAgrupamento() {
		return agrupamento;
	}
	public void setAgrupamento(String agrupamento) {
		this.agrupamento = agrupamento;
	}
	
	

}
