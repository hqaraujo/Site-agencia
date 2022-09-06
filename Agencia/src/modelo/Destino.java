package modelo;

public class Destino {
	// Atributos
	
	private int id_destino;
	private String pais;
	private String cidade;
	
	
	
	// Construtores 
public Destino() {
		
	}

	public Destino(int id_destino, String pais,
			String cidade ) {
		this.id_destino = id_destino;
		this.pais = pais;
		this.cidade = cidade;
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
	
	//Metodos
	
	
			public String mostrar() {
				return "id_destino: " + this.id_destino + 
						" pais: " + this.pais + 
						"cidade: " + this.cidade;
				
			}
	
	


}
