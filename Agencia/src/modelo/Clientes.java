package modelo;

public class Clientes {

	// Atributos
	
	private int id_cliente;
	private String cpf_cliente;
	private String nome_cliente;
	private String email_cliente;
	private Login login;
	
	
	// Construtores 
public Clientes() {
		
	}


	public Clientes(int id_cliente, String cpf_cliente, String nome_cliente, String email_cliente, Login login) {
		super();
		this.id_cliente = id_cliente;
		this.cpf_cliente = cpf_cliente;
		this.nome_cliente = nome_cliente;
		this.email_cliente = email_cliente;
		this.login = login;
	}


	//Gets e Sets
	

		public int getId_cliente() {
			return id_cliente;
		}


		public void setId_cliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}


		public String getCpf_cliente() {
			return cpf_cliente;
		}


		public void setCpf_cliente(String cpf_cliente) {
			this.cpf_cliente = cpf_cliente;
		}


		public String getNome_cliente() {
			return nome_cliente;
		}


		public void setNome_cliente(String nome_cliente) {
			this.nome_cliente = nome_cliente;
		}


		public String getEmail_cliente() {
			return email_cliente;
		}


		public void setEmail_cliente(String email_cliente) {
			this.email_cliente = email_cliente;
		}


		public void setLogin(Login login) {
			this.login = login;
		}


		public Login getLogin(Login login) {
			return this.login = login;
		}

		//Metodos
		@Override
		public String toString() {
			return "Clientes [id_cliente=" + id_cliente + ", cpf_cliente=" + cpf_cliente + ", nome_cliente="
					+ nome_cliente + ", email_cliente=" + email_cliente + ", login=" + login + "]";
		}


		public Login getLogin() {
			// TODO Auto-generated method stub
			return null;
		}


		public String getClientes() {
			// TODO Auto-generated method stub
			return null;
		}


	
			
		}
		
	
		
		
	
	
	

