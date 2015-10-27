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

	public void gerarHemocentros() throws JAXBException {
		HemocentroXML hemocentroXML = new HemocentroXML();
		List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
		Hemocentro hemocentro = new Hemocentro();
		
		hemocentro.setId("1");
		hemocentro.setNome("Hemope");
		
		hemocentros.add(hemocentro);
		hemocentroXML.setHemocentros(hemocentros);
		
		/*
		Cardapio cardapio = new Cardapio();
		
		List<Bebida> bebidas = new ArrayList<Bebida>();
		
		Bebida bebida1 = new Bebida();
		bebida1.setNome("Coca-cola");
		bebida1.setDescrição("Coca-cola 500ml");
		bebida1.setPreco(3.00);
		
		Bebida bebida2 = new Bebida();
		bebida2.setNome("Fanta");
		bebida2.setDescrição("Fanta 500ml");
		bebida2.setPreco(2.80);
		
		bebidas.add(bebida1);
		bebidas.add(bebida2);
		
		List<Prato> pratos = new ArrayList<Prato>();
		
		Prato prato1 = new Prato();
		prato1.setNome("Frango grelhado");
		prato1.setDescrição("Frango grelhado com arroz à grega e batata frita");
		prato1.setPreco(15.00);
		
		Prato prato2 = new Prato();
		prato2.setNome("Medalhões ao barbecue");
		prato2.setDescrição("Medalhões de filé mignon com arroz branco e legumes");
		prato2.setPreco(20.00);
		
		pratos.add(prato1);
		pratos.add(prato2);
		
		cardapio.setBebidas(bebidas);
		cardapio.setPratos(pratos);
		*/
		save("hemocentros.xml", hemocentroXML);
	}
}