package br.com.upe.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HemocentroXML {
	private List<Hemocentro> hemocentros;

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}
	
	@XmlElement
	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	}

	
}
