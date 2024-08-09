package entities;

public class ContatoUsuario {

	private int idUsuario;
    private String telefone;
    private String email;
	public ContatoUsuario(int idUsuario, String telefone, String email) {
		this.idUsuario = idUsuario;
		this.telefone = telefone;
		this.email = email;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}

   
	
}
