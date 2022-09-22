package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Destino;
import modelo.Clientes;






@SuppressWarnings("unused")
public class Compras {

	// Atributos

	private double valor_total;
	private String forma_pagamento;
	private double valor;
	private String data_compras;
	private int id_compras;
	private Clientes clientes;
	private Destino destino;
	
	
	DateTimeFormatter formata = DateTimeFormatter.ofPattern("d/MM/yyyy");

	// Construtores

	public Compras(int id_compra, Destino destino1, Clientes cliente1, double valor_total2, String forma_pagamento2, double valor2, String data_compras2) {
		super();

	}


	public Compras(double valor_total, String forma_pagamento, double valor, String data_compras, int id_compras,
			Clientes clientes, Destino destino, DateTimeFormatter formata) {
		super();
		this.valor_total = valor_total;
		this.forma_pagamento = forma_pagamento;
		this.valor = valor;
		this.data_compras = data_compras;
		this.id_compras = id_compras;
		this.clientes = clientes;
		this.destino = destino;
		this.formata = formata;
	}

	// Gets e Sets

	public Compras() {
		// TODO Auto-generated constructor stub
	}


	public double getValor_total() {
		return valor_total;
	}


	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}


	public String getForma_pagamento() {
		return forma_pagamento;
	}


	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getId_compras() {
		return id_compras;
	}


	public void setId_compras(int id_compras) {
		this.id_compras = id_compras;
	}


	public Clientes getClientes() {
		return clientes;
	}


	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}


	public Destino getDestino() {
		return destino;
	}


	public void setDestino(Destino destino) {
		this.destino = destino;
	}


	public DateTimeFormatter getFormata() {
		return formata;
	}


	public void setFormata(DateTimeFormatter formata) {
		this.formata = formata;
	}


	public String getData_compras() {
		return data_compras;
	}
	
	// Metodos


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


	public void setData_compras(String format) {
		// TODO Auto-generated method stub
		
	}


	public int getId_cliente() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void add(Compras compras) {
		// TODO Auto-generated method stub
		
	}








	
	
	
	
	
	
	
	

}

	
	
	

