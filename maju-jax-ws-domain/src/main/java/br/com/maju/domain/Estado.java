package br.com.maju.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estado {
	
	
	private String nome;
	private String Sigla;
	private Regiao regiao;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return Sigla;
	}
	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	
	
}
