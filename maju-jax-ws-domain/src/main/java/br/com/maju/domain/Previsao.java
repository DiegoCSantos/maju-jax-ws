package br.com.maju.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Previsao {
	
	@Id
	private int id;
	
	@Column
	private Date hora;
	
	@Column
	private String clima;
	
	@Column
	private int maxima;
	
	@Column
	private int minima;
	
	@Column
	private String localizacao;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
