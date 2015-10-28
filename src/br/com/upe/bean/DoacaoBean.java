package br.com.upe.bean;

import br.com.upe.model.Doacao;
import br.com.upe.model.Hemocentro;
import br.com.upe.xml.LoadXML;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ximenes on 27/10/15.
 */
@ManagedBean
public class DoacaoBean {

    private List<Doacao> doacoes = new ArrayList<Doacao>();

    public DoacaoBean() {

    }

    @PostConstruct
    public void populateDoacoesList() {
        try {
            this.doacoes.addAll(LoadXML.getDoacoes());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }

}
