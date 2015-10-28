package br.com.upe.xml;

import br.com.upe.model.Campanha;
import br.com.upe.model.Doacao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

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
