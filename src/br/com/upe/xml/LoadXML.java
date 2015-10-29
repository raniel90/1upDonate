package br.com.upe.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

//github.com/raniel90/1upDonate.git
import br.com.upe.model.Campanha;
import br.com.upe.model.Doacao;
import br.com.upe.model.Doador;
//github.com/raniel90/1upDonate.git
import br.com.upe.model.Hemocentro;

public class LoadXML {

    private static final String path = "/Users/ximenes/desenvolvimento/java.projetos/1upDonate/";
    // Hemocentros
	public static Object loadHemocentro(String xml, Class<HemocentroXML> class1) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(class1);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}
	
	public static Object loadDoador(String xml, Class<DoadorXML> class1) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(class1);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}
	
	public static List<Hemocentro> getHemocentros() throws JAXBException {
		HemocentroXML hemocentroXML = (HemocentroXML) loadHemocentro("hemocentros.xml", HemocentroXML.class);

		//HemocentroXML hemocentroXML = (HemocentroXML) loadHemocentro(path + "hemocentros.xml", HemocentroXML.class);
		
		List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
		hemocentros.addAll(hemocentroXML.getHemocentros());

		
		return hemocentros;
	}
	
	public static List<Doador> getDoadores() throws JAXBException {
		
		DoadorXML doadorXML = (DoadorXML) loadDoador("doadores.xml", DoadorXML.class);
		
		List<Doador> doadores = new ArrayList<Doador>();
		doadores.addAll(doadorXML.getDoadores());
		
		return doadores;
	}
	
    // Doacoes
    public static Object loadDoacoes(String xml, Class<DoacaoXML> class1) throws JAXBException {
        File file = new File(xml);
        JAXBContext jaxbContext = JAXBContext.newInstance(class1);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return jaxbUnmarshaller.unmarshal(file);
    }

    public static List<Doacao> getDoacoes() throws JAXBException {

        //DoacaoXML doacaoXML = (DoacaoXML) loadDoacoes(path + "doacoes.xml", DoacaoXML.class);
    	DoacaoXML doacaoXML = (DoacaoXML) loadDoacoes("doacoes.xml", DoacaoXML.class);

        List<Doacao> doacoes = new ArrayList<Doacao>();
        doacoes.addAll(doacaoXML.getDoacoes());

        return doacoes;
    }

    // Campanhas
    public static Object loadCampanhas(String xml, Class<CampanhaXML> class1) throws JAXBException {
        File file = new File(xml);
        JAXBContext jaxbContext = JAXBContext.newInstance(class1);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return jaxbUnmarshaller.unmarshal(file);
    }

    public static List<Campanha> getCampanhas() throws JAXBException {

        //CampanhaXML campanhaXML = (CampanhaXML) loadCampanhas(path + "campanhas.xml", CampanhaXML.class);
    	CampanhaXML campanhaXML = (CampanhaXML) loadCampanhas("campanhas.xml", CampanhaXML.class);

        List<Campanha> campanhas = new ArrayList<Campanha>();
        campanhas.addAll(campanhaXML.getCampanhas());

        return campanhas;
    }

}
