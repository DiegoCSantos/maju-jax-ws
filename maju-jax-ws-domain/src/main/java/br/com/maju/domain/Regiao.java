package br.com.maju.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Regiao {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
