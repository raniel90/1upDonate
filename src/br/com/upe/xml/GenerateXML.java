package br.com.upe.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.upe.model.HemocentroXML;
import br.com.upe.model.Hemocentro;

public class GenerateXML {

	public static void save(String xml, Object object) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(object, file);
	}

	public static void main(String[] args) throws JAXBException {
		HemocentroXML hemocentroXML = new HemocentroXML();
		List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
		Hemocentro hemocentro = new Hemocentro();
		
		hemocentro.setId("1");
		hemocentro.setNome("Hemope");
		
		hemocentros.add(hemocentro);
		hemocentroXML.setHemocentros(hemocentros);
		
		save("hemocentros.xml", hemocentroXML);
	}
}