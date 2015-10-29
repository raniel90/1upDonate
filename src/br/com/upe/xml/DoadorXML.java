package br.com.upe.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.upe.model.Doador;
@XmlRootElement
public class DoadorXML {
	private List<Doador> doadores;

	public final List<Doador> getDoadores() {
		if (doadores == null) {
			doadores = new ArrayList<Doador>();
		}
		return doadores;
	}

	@XmlElement
	public final void setDoadores(List<Doador> doadores) {
		this.doadores = doadores;
	}

}