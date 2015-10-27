package br.com.upe.model;

import br.com.upe.enums.TipoSanguineo;

public class Campanha {
	private String id;
	private Hemocentro hemocentro;
	private String descricao;
	private String dataInicial;
	private String dataFinal;
	private TipoSanguineo tipoSanguineo;
	private String nomeRecebedor;
	private String cpfRecebedor;
	private String origemCadastro;
	private String idAutorCampanha;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getNomeRecebedor() {
		return nomeRecebedor;
	}

	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}

	public String getCpfRecebedor() {
		return cpfRecebedor;
	}

	public void setCpfRecebedor(String cpfRecebedor) {
		this.cpfRecebedor = cpfRecebedor;
	}

	public String getOrigemCadastro() {
		return origemCadastro;
	}

	public void setOrigemCadastro(String origemCadastro) {
		this.origemCadastro = origemCadastro;
	}

	public String getIdAutorCampanha() {
		return idAutorCampanha;
	}

	public void setIdAutorCampanha(String idAutorCampanha) {
		this.idAutorCampanha = idAutorCampanha;
	}

}
