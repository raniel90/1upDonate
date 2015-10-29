package br.com.upe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

import br.com.upe.model.Doador;
import br.com.upe.xml.LoadXML;

@ManagedBean
@SessionScoped
public class DoadorBean {
	private List<Doador> doadores = new ArrayList<Doador>();
	private PieChartModel pieModelTipoSanguineo;


	public DoadorBean() {

	}

	@PostConstruct
	public void populateDoadorList() {
		try {
			this.doadores.addAll(LoadXML.getDoadores());
			
			createPieModel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    private void createPieModel() {
    	pieModelTipoSanguineo = new PieChartModel();            	    	     
    	
    	pieModelTipoSanguineo.set("AB POSITIVO", 3);
    	pieModelTipoSanguineo.set("O NEGATIVO", 7);
    	pieModelTipoSanguineo.set("AB POSITIVO", 1);
    	pieModelTipoSanguineo.set("A POSITIVO", 5);
    	pieModelTipoSanguineo.set("A NEGATIVO", 5);
         
    	pieModelTipoSanguineo.setTitle("Tipo sanguineo");
    	pieModelTipoSanguineo.setLegendPosition("w");
    }
	
	public List<Doador> getDoadores() {
		return doadores;
	}

	public void setDoadores(List<Doador> doadores) {
		this.doadores = doadores;
	}
	
	public final PieChartModel getPieModelTipoSanguineo() {
		return pieModelTipoSanguineo;
	}

}