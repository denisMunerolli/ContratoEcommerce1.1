package entities;

public class ConfigsContato {

	private int idUsuario;
    private int idEmpresa;
    private boolean aceitaReceberEmailGeral;
    private boolean aceitaReceberEmailOferta;
    private boolean aceitaReceberEmailAlteracao;
    private boolean aceitaReceberSMS;
    private String numeroSMS;
    private String emailNotificacoes;
    private String dataUltimaAtualizacaoSenha;
    private boolean aceitaReceberNotificacao;
	public ConfigsContato(int idUsuario, int idEmpresa, boolean aceitaReceberEmailGeral,
			boolean aceitaReceberEmailOferta, boolean aceitaReceberEmailAlteracao, boolean aceitaReceberSMS,
			String numeroSMS, String emailNotificacoes, String dataUltimaAtualizacaoSenha,
			boolean aceitaReceberNotificacao) {
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.aceitaReceberEmailGeral = aceitaReceberEmailGeral;
		this.aceitaReceberEmailOferta = aceitaReceberEmailOferta;
		this.aceitaReceberEmailAlteracao = aceitaReceberEmailAlteracao;
		this.aceitaReceberSMS = aceitaReceberSMS;
		this.numeroSMS = numeroSMS;
		this.emailNotificacoes = emailNotificacoes;
		this.dataUltimaAtualizacaoSenha = dataUltimaAtualizacaoSenha;
		this.aceitaReceberNotificacao = aceitaReceberNotificacao;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public boolean isAceitaReceberEmailGeral() {
		return aceitaReceberEmailGeral;
	}
	public boolean isAceitaReceberEmailOferta() {
		return aceitaReceberEmailOferta;
	}
	public boolean isAceitaReceberEmailAlteracao() {
		return aceitaReceberEmailAlteracao;
	}
	public boolean isAceitaReceberSMS() {
		return aceitaReceberSMS;
	}
	public String getNumeroSMS() {
		return numeroSMS;
	}
	public String getEmailNotificacoes() {
		return emailNotificacoes;
	}
	public String getDataUltimaAtualizacaoSenha() {
		return dataUltimaAtualizacaoSenha;
	}
	public boolean isAceitaReceberNotificacao() {
		return aceitaReceberNotificacao;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setAceitaReceberEmailGeral(boolean aceitaReceberEmailGeral) {
		this.aceitaReceberEmailGeral = aceitaReceberEmailGeral;
	}
	public void setAceitaReceberEmailOferta(boolean aceitaReceberEmailOferta) {
		this.aceitaReceberEmailOferta = aceitaReceberEmailOferta;
	}
	public void setAceitaReceberEmailAlteracao(boolean aceitaReceberEmailAlteracao) {
		this.aceitaReceberEmailAlteracao = aceitaReceberEmailAlteracao;
	}
	public void setAceitaReceberSMS(boolean aceitaReceberSMS) {
		this.aceitaReceberSMS = aceitaReceberSMS;
	}
	public void setNumeroSMS(String numeroSMS) {
		this.numeroSMS = numeroSMS;
	}
	public void setEmailNotificacoes(String emailNotificacoes) {
		this.emailNotificacoes = emailNotificacoes;
	}
	public void setDataUltimaAtualizacaoSenha(String dataUltimaAtualizacaoSenha) {
		this.dataUltimaAtualizacaoSenha = dataUltimaAtualizacaoSenha;
	}
	public void setAceitaReceberNotificacao(boolean aceitaReceberNotificacao) {
		this.aceitaReceberNotificacao = aceitaReceberNotificacao;
	}

    

	
	
}
