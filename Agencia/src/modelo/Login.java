package modelo;

public class Login {
	
	private int id_login;
	private String tipo_login;
	
	
	
	public Login() {
		super();
	}



	public Login(int id_login, String tipo_login) {
		super();
		this.id_login = id_login;
		this.tipo_login = tipo_login;
	}



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



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
	
	
	
	

}
