package br.com.upe.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.upe.enums.TipoSanguineo;
<<<<<<< HEAD
import br.com.upe.model.Doador;
=======
import br.com.upe.model.Campanha;
import br.com.upe.model.Doacao;
import br.com.upe.model.Doador;
import br.com.upe.model.Hemocentro;
>>>>>>> branch 'master' of https://github.com/raniel90/1upDonate.git

public class GenerateXML {

	public static void save(String xml, Object object) throws JAXBException {
		File file = new File(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(object, file);
	}

	public static void main(String[] args) throws JAXBException {
<<<<<<< HEAD
				
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
=======
	List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
    	Hemocentro hemocentro = new Hemocentro();
		hemocentro.setId("1");
		hemocentro.setNome("Hemope");

        CampanhaXML campanhaXML = new CampanhaXML();
        List<Campanha> campanhas = new ArrayList<Campanha>();

        Campanha camp1 = new Campanha();
        camp1.setId("1");
        camp1.setCpfRecebedor("063.252.984-80");
        camp1.setDataInicial("29/10/2015");
        camp1.setDataFinal("31/12/2015");
        camp1.setNomeRecebedor("Mario José da Silva");
        camp1.setDescricao(camp1.getNomeRecebedor() + " precisa urgentemente de " +
                           "sangue do tipo AB+, pois passará por cirugia" +
                           "quem puder nos ajudar, ficaremos muito gratos");
        camp1.setHemocentro(hemocentro);
        camp1.setTipoSanguineo(TipoSanguineo.AB_POSITIVO);
        camp1.setOrigemCadastro("D");
        campanhas.add(camp1);

        Campanha camp2 = new Campanha();
        camp2.setId("2");
        camp2.setCpfRecebedor("283.555.434-32");
        camp2.setDataInicial("01/11/2015");
        camp2.setDataFinal("15/11/2015");
        camp2.setNomeRecebedor("Fernanda Ferreira Melo");
        camp2.setDescricao(camp2.getNomeRecebedor() + " precisa de sua ajuda para poder fazer seu transplante.");
        camp2.setHemocentro(hemocentro);
        camp2.setTipoSanguineo(TipoSanguineo.O_NEGATIVO);
        camp2.setOrigemCadastro("D");
        campanhas.add(camp2);


        campanhaXML.setCampanhas(campanhas);



        campanhaXML.setCampanhas(campanhas);
        save("campanhas.xml", campanhaXML);

>>>>>>> branch 'master' of https://github.com/raniel90/1upDonate.git
	}
}