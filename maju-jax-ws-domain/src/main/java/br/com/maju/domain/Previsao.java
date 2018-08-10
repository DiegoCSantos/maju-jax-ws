package br.com.maju.domain;

import java.util.Date;

public class Previsao {
	
	private Date hora;
	private String clima;
	private int maxima;
	private int minima;
	private String localizacao;
	
	
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public int getMaxima() {
		return maxima;
	}
	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}
	public int getMinima() {
		return minima;
	}
	public void setMinima(int minima) {
		this.minima = minima;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
	

}
