package br.com.upe.xml;

import br.com.upe.model.Doacao;
import br.com.upe.model.Hemocentro;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class DoacaoXML {
	private List<Doacao> doacoes;

	public List<Doacao> getDoacoes() {
		return doacoes;
	}
	
	@XmlElement
	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}

	
}
