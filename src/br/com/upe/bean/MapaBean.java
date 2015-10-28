package br.com.upe.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
@SessionScoped
public class MapaBean {

	private MapModel simpleModel;

	@PostConstruct
	public void init() {
		simpleModel = new DefaultMapModel();

		LatLng coord1 = new LatLng(-8.063282,-34.902991);
		LatLng coord2 = new LatLng(-8.0605552,-34.90547);

		simpleModel.addOverlay(new Marker(coord1, "Estádio Adelmar da Costa Carvalho"));
		simpleModel.addOverlay(new Marker(coord2, "Escola Politécnica de Pernambuco"));
	}

	public MapModel getSimpleModel() {
		return simpleModel;
	}
}