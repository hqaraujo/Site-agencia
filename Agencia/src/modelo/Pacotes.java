package modelo;



public class Pacotes {

	// Atributos

	private int id_pacote;
	private String origem;
	private double promocao;
	

	// Construtores

	public Pacotes() {
		super();
	}

	public Pacotes(int id_pacote, String origem, double promocao) {
		super();
		this.id_pacote = id_pacote;
		this.origem = origem;
		this.promocao = promocao;
		
	}
	
	
	// Gets e Sets

	public int getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote1(int pacotes2) {
		this.id_pacote = pacotes2;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getPromocao() {
		return promocao;
	}

	public void setPromocao(double promocao) {
		this.promocao = promocao;
	}

	// metodos
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
