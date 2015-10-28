package br.com.upe.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.upe.enums.TipoSanguineo;
import br.com.upe.model.Doador;

public class GenerateXML {

	public static void save(String xml, Object object) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(object, file);
	}

	public static void main(String[] args) throws JAXBException {
				
		DoadorXML doadorXML = new DoadorXML();
		
		for(int i = 1; i <= 15; i++ ) {
			Doador doador = new Doador();
			doador.setId(String.valueOf(i));
			doador.setNome("Doador : " + i);
			
			if( i % 2 == 0){
				doador.setTipoSanguineo(TipoSanguineo.A_POSITIVO );	
			}else
			{
				doador.setTipoSanguineo(TipoSanguineo.O_NEGATIVO );
			}
			
			
			doadorXML.getDoadores().add(doador);
		}
		
		save("doadores.xml", doadorXML);
	}
}