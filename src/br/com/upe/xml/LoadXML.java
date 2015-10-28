package br.com.upe.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.upe.model.Doador;
import br.com.upe.model.Hemocentro;

public class LoadXML {

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
	
}