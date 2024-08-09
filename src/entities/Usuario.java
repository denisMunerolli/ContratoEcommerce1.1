package entities;

public class Usuario {

	private int idUsuario;
    private int idEmpresa;
    private String nomeUsuario;
    private String sobrenome;
    private String login;
    private String senha;
    private String cpf;
    private String email;
    private String status;
    private String cargo;
    private String superiorImediato;
    private String cargoSuperiorImediato;
    private boolean blackList;
    private String justificativaBloqueio;
    private boolean docEmDia;
	public Usuario(int idUsuario, int idEmpresa, String nomeUsuario, String sobrenome, String login, String senha,
			String cpf, String email, String status, String cargo, String superiorImediato,
			String cargoSuperiorImediato, boolean blackList, String justificativaBloqueio, boolean docEmDia) {
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.nomeUsuario = nomeUsuario;
		this.sobrenome = sobrenome;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
		this.status = status;
		this.cargo = cargo;
		this.superiorImediato = superiorImediato;
		this.cargoSuperiorImediato = cargoSuperiorImediato;
		this.blackList = blackList;
		this.justificativaBloqueio = justificativaBloqueio;
		this.docEmDia = docEmDia;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getStatus() {
		return status;
	}
	public String getCargo() {
		return cargo;
	}
	public String getSuperiorImediato() {
		return superiorImediato;
	}
	public String getCargoSuperiorImediato() {
		return cargoSuperiorImediato;
	}
	public boolean isBlackList() {
		return blackList;
	}
	public String getJustificativaBloqueio() {
		return justificativaBloqueio;
	}
	public boolean isDocEmDia() {
		return docEmDia;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSuperiorImediato(String superiorImediato) {
		this.superiorImediato = superiorImediato;
	}
	public void setCargoSuperiorImediato(String cargoSuperiorImediato) {
		this.cargoSuperiorImediato = cargoSuperiorImediato;
	}
	public void setBlackList(boolean blackList) {
		this.blackList = blackList;
	}
	public void setJustificativaBloqueio(String justificativaBloqueio) {
		this.justificativaBloqueio = justificativaBloqueio;
	}
	public void setDocEmDia(boolean docEmDia) {
		this.docEmDia = docEmDia;
	}


	
}
