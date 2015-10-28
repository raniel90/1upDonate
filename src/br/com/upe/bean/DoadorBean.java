package br.com.upe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.bind.JAXBException;

import br.com.upe.model.Doador;
import br.com.upe.model.Hemocentro;
import br.com.upe.xml.LoadXML;

@ManagedBean
@SessionScoped
public class DoadorBean {
	private List<Doador> doadores = new ArrayList<Doador>();	
	public DoadorBean() {

	}
	
	@PostConstruct
	public void populateDoadorList() {
		try {
			this.doadores.addAll(LoadXML.getDoadores());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Doador> getDoadores() {
		return doadores;
	}

	public void setDoadores(List<Doador> doadores) {
		this.doadores = doadores;
	}

}
