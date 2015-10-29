package br.com.upe.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.upe.model.Campanha;

@XmlRootElement
public class CampanhaXML {
	private List<Campanha> campanhas;

	public List<Campanha> getCampanhas() {
		return campanhas;
	}
	
	@XmlElement
	public void setCampanhas(List<Campanha> campanhas) {
		this.campanhas = campanhas;
	}
}
