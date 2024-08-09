package entities;

public class Empresa {

	private int idEmpresa;
    private String cnpj;
    private String tipoEmpresa;
	public Empresa(int idEmpresa, String cnpj, String tipoEmpresa) {
		this.idEmpresa = idEmpresa;
		this.cnpj = cnpj;
		this.tipoEmpresa = tipoEmpresa;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

  
	
}
