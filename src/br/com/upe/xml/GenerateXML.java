package br.com.upe.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.upe.enums.TipoSanguineo;
import br.com.upe.model.Doacao;
import br.com.upe.model.Doador;
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
	List<Hemocentro> hemocentros = new ArrayList<Hemocentro>();
    	Hemocentro hemocentro = new Hemocentro();
		hemocentro.setId("1");
		hemocentro.setNome("Hemope");

        DoacaoXML doacaoXML = new DoacaoXML();
        List<Doacao> doacoes = new ArrayList<Doacao>();
        Doador doador;
        Doacao doacao = null;

        for (int i = 1; i <= 10; i++){
            doador = new Doador();
            doacao = new Doacao();

            Integer id = i;
            doador.setId(id.toString());
            doador.setNome("Doador " + doador.getId());


            doacao.setHemocentro(hemocentro);
            doacao.setDoador(doador);
            doacao.setData("27/12/2015");
            doacao.setPossuiCampanha(false);
            doacao.setTipoSanguineo(TipoSanguineo.O_NEGATIVO);
            doacao.setQtd(id);
            doacoes.add(doacao);
        }

        doacaoXML.setDoacoes(doacoes);
        save("doacoes.xml", doacaoXML);

	}
}