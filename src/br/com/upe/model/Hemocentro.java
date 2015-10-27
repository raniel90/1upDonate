package br.com.upe.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hemocentro {
	private String id;
	private String nome;

	public String getId() {
		return id;
	}

	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	@XmlElement
	public void setNome(String nome) {
		this.nome = nome;
	}

}
