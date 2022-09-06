package modelo;

public class Login{
	

	// Atributos
	
	private int id_login;
	private String tipo_login;
	
	
	//Construtores
	
	public Login() {
		
	}

	public Login(int id_login, String tipo_login) {
		this.id_login = id_login;
		this.tipo_login = tipo_login;
	}
	

	
	//Gets e Sets

	public int getId_login() {
		return id_login;
	}

	public void setId_login(int id_login) {
		this.id_login = id_login;
	}

	public String getTipo_login() {
		return tipo_login;
	}

	public void setTipo_login(String tipo_login) {
		this.tipo_login = tipo_login;
	}

	//Metodo
	@Override
	public String toString() {
		return "Login [id_login=" + id_login + ", tipo_login=" + tipo_login + "]";
	}
	
	
	

}

