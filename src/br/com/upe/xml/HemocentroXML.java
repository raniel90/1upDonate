package br.com.upe.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.upe.model.Hemocentro;

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
