package modelo;
import modelo.Destino;

public class Pacotes {
	
	// Atributos
	
		private int id_pacote;
		private String origem;
		private double promocao;
		private Destino destino;
		
		
		// Construtores 
		
		public Pacotes() {
			super();
		}

		public Pacotes(int id_pacote, String origem, double promocao, Destino destino) {
			super();
			this.id_pacote = id_pacote;
			this.origem = origem;
			this.promocao = promocao;
			this.destino = destino;
		}




		//Gets e Sets
		

		public int getId_pacote() {
			return id_pacote;
		}

		public void setId_pacote(int id_pacote) {
			this.id_pacote = id_pacote;
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

		public Destino getDestino() {
			return destino;
		}

		public void setDestino(Destino destino) {
			this.destino = destino;
		}
		
		//metodos
		

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

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}

