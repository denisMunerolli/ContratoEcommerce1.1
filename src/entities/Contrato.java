package entities;

import java.util.Date;

public class Contrato {

	private int idContrato;
    private String tituloContrato;
    private Date dataCriacao;
    private Date vigenciaInicio;
    private Date vigenciaFim;
    private int idUsuarioContratante;
    private int idEmpresaContratante;
    private int idFornecedor;
    private int idEmpresaFornec;
    private int idMoeda;
    private String descricao;
    private String observacoes;
    private String status;
	public Contrato(int idContrato, String tituloContrato, Date dataCriacao, Date vigenciaInicio, Date vigenciaFim,
			int idUsuarioContratante, int idEmpresaContratante, int idFornecedor, int idEmpresaFornec, int idMoeda,
			String descricao, String observacoes, String status) {
		this.idContrato = idContrato;
		this.tituloContrato = tituloContrato;
		this.dataCriacao = dataCriacao;
		this.vigenciaInicio = vigenciaInicio;
		this.vigenciaFim = vigenciaFim;
		this.idUsuarioContratante = idUsuarioContratante;
		this.idEmpresaContratante = idEmpresaContratante;
		this.idFornecedor = idFornecedor;
		this.idEmpresaFornec = idEmpresaFornec;
		this.idMoeda = idMoeda;
		this.descricao = descricao;
		this.observacoes = observacoes;
		this.status = status;
	}
	public int getIdContrato() {
		return idContrato;
	}
	public String getTituloContrato() {
		return tituloContrato;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public Date getVigenciaInicio() {
		return vigenciaInicio;
	}
	public Date getVigenciaFim() {
		return vigenciaFim;
	}
	public int getIdUsuarioContratante() {
		return idUsuarioContratante;
	}
	public int getIdEmpresaContratante() {
		return idEmpresaContratante;
	}
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public int getIdEmpresaFornec() {
		return idEmpresaFornec;
	}
	public int getIdMoeda() {
		return idMoeda;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public String getStatus() {
		return status;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public void setTituloContrato(String tituloContrato) {
		this.tituloContrato = tituloContrato;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public void setVigenciaInicio(Date vigenciaInicio) {
		this.vigenciaInicio = vigenciaInicio;
	}
	public void setVigenciaFim(Date vigenciaFim) {
		this.vigenciaFim = vigenciaFim;
	}
	public void setIdUsuarioContratante(int idUsuarioContratante) {
		this.idUsuarioContratante = idUsuarioContratante;
	}
	public void setIdEmpresaContratante(int idEmpresaContratante) {
		this.idEmpresaContratante = idEmpresaContratante;
	}
	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public void setIdEmpresaFornec(int idEmpresaFornec) {
		this.idEmpresaFornec = idEmpresaFornec;
	}
	public void setIdMoeda(int idMoeda) {
		this.idMoeda = idMoeda;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public void setStatus(String status) {
		this.status = status;
	}

   
	
}
