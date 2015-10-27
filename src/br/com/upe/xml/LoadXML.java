package br.com.upe.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.upe.model.HemocentroXML;
import br.com.upe.model.Hemocentro;

public class LoadXML {

	public static Object load(String xml, Class<HemocentroXML> class1) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(class1);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}

	public static void main(String[] args) throws JAXBException {
		HemocentroXML gerarXML = (HemocentroXML) load("hemocentros.xml", HemocentroXML.class);
		System.out.println("Cadastro de Hemocentro\n");
//		for(Object object : gerarXML.getListObject()){
//			if(object.getClass().isInstance(Hemocentro.class)){
//				Hemocentro hemocentro = (Hemocentro) object;
//				System.out.println("id: " + hemocentro.getId() + " Nome: " + hemocentro.getNome());
//			}
//		}
	}
}