package br.com.upe.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.upe.model.Hemocentro;

public class LoadXML {

	public static Object load(String xml, Class<HemocentroXML> class1) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(class1);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}

	public static List<Hemocentro> getHemocentros() throws JAXBException {
		HemocentroXML hemocentroXML = (HemocentroXML) load("hemocentros.xml", HemocentroXML.class);
		
		List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
		hemocentros.addAll(hemocentroXML.getHemocentros());
		
		return hemocentros;
	}
}