package br.com.upe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.upe.model.Hemocentro;
import br.com.upe.xml.LoadXML;

@ManagedBean
@SessionScoped
public class HemocentroBean {
	private List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();

	public HemocentroBean() {

	}

	@PostConstruct
	public void populateHemocentroList() {
		try {
			this.hemocentros.addAll(LoadXML.getHemocentros());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}

	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	}

}
