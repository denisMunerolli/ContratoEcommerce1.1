package entities;

import java.util.Date;

public class Log {

	private int idLog;
    private int idUsuario;
    private int idEmpresa;
    private String acao;
    private Date dataHora;
    private String descricao;
	public Log(int idLog, int idUsuario, int idEmpresa, String acao, Date dataHora, String descricao) {
		this.idLog = idLog;
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.acao = acao;
		this.dataHora = dataHora;
		this.descricao = descricao;
	}
	public Log() {
		// TODO Auto-generated constructor stub
	}
	public int getIdLog() {
		return idLog;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public String getAcao() {
		return acao;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

   
	
}
