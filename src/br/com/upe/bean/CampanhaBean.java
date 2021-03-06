package br.com.upe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.upe.model.Campanha;
import br.com.upe.xml.LoadXML;

/**
 * Created by ximenes on 27/10/15.
 */
@ManagedBean
public class CampanhaBean {

    private List<Campanha> campanhas = new ArrayList<Campanha>();

    public CampanhaBean() {

    }

    @PostConstruct
    public void populateDoacoesList() {
        try {
            this.campanhas.addAll(LoadXML.getCampanhas());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<Campanha> getCampanhas() {
        return campanhas;
    }

    public void setCampanhas(List<Campanha> campanhas) {
        this.campanhas = campanhas;
    }

}
