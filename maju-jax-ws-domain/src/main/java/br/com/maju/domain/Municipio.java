package br.com.maju.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Municipio {
	
	private String nome;
	private Estado estado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
