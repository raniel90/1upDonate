package br.com.upe.model;

import br.com.upe.enums.TipoSanguineo;

public class Doacao {
	private Hemocentro hemocentro;
	private Doador doador;
	private Campanha campanha;
	private String data;
	private boolean possuiCampanha;
	private TipoSanguineo tipoSanguineo;
	private Integer qtd;

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isPossuiCampanha() {
		return possuiCampanha;
	}

	public void setPossuiCampanha(boolean possuiCampanha) {
		this.possuiCampanha = possuiCampanha;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

}
