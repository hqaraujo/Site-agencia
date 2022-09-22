package modelo;

import modelo.Destino;

public class Destino {
	// Atributos
	
	private int id_destino;
	private String pais;
	private String cidade;
	private Pacotes pacotes;

	
	
	// Construtores 

	public Destino() {
		super();
	}
	
	public Destino(int id_destino, String pais, String cidade, Pacotes pacotes) {
		super();
		this.id_destino = id_destino;
		this.pais = pais;
		this.cidade = cidade;
		this.pacotes = pacotes;
	}


	public Destino(int id_destino2, String pais2, String cidade2) {
		// TODO Auto-generated constructor stub
	}

	//Gets e Sets
	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Pacotes getPacotes() {
		return pacotes;
	}

	public void setPacotes(Pacotes pacotes) {
		this.pacotes = pacotes;
	}
	
	//Metodos

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

	public void setId_pacote(int int1) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	


		
	
	
		
	
	


}
