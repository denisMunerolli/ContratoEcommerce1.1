package entities;

public class Endereco {
 
	private int idEndereco;
    private int idEmpresa;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String distrito;
    private String cep;
    private String tipoEndereco;
    private boolean padrao;
	public Endereco(int idEndereco, int idEmpresa, String logradouro, String numero, String complemento, String bairro,
			String cidade, String estado, String distrito, String cep, String tipoEndereco, boolean padrao) {
		this.idEndereco = idEndereco;
		this.idEmpresa = idEmpresa;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.distrito = distrito;
		this.cep = cep;
		this.tipoEndereco = tipoEndereco;
		this.padrao = padrao;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getDistrito() {
		return distrito;
	}
	public String getCep() {
		return cep;
	}
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public boolean isPadrao() {
		return padrao;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public void setPadrao(boolean padrao) {
		this.padrao = padrao;
	}

    
	
}
