package br.com.upe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.upe.model.Hemocentro;

@ManagedBean
@SessionScoped
public class HemocentroBean {
	private List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();

	public HemocentroBean() {

	}

	@PostConstruct
	public void populateHemocentroList() {
		for (int i = 1; i <= 10; i++) {
			Hemocentro emp = new Hemocentro();
			emp.setId(String.valueOf(i));
			emp.setNome("Hemocentro#" + i);
			this.hemocentros.add(emp);
		}
	}

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}

	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	}

}
