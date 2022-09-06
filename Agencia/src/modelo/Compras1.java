package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.Clientes;
import modelo.Pacotes;

public class Compras1 {

	// Atributos

	private double valor_total;
	private String forma_pagamento;
	private double valor;
	private LocalDate data_compras;
	private int id_compras;
	private Clientes clientes;
	private Pacotes pacotes;
	
	DateTimeFormatter formata = DateTimeFormatter.ofPattern("d/MM/yyyy");

	// Construtores

	public Compras1() {
		super();

	}

	public Compras1(double valor_total, String forma_pagamento, double valor, String data_compras, int id_compras,
			Clientes clientes, Pacotes pacotes) {
		super();
		this.valor_total = valor_total;
		this.forma_pagamento = forma_pagamento;
		this.valor = valor;
		this.data_compras = LocalDate.parse(data_compras, formata);
		this.id_compras = id_compras;
		this.clientes = clientes;
		this.pacotes = pacotes;
	}

	// Gets e Sets
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

	public String getData_compras() {
		return formata.format(data_compras);
	}

	public void setData_compras(String data_compras) {
		this.data_compras = LocalDate.parse(data_compras, formata);
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

	public Pacotes getPacotes() {
		return pacotes;
	}

	public void setPacotes(Pacotes pacotes) {
		this.pacotes = pacotes;
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

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void add(Compras1 compra) {
		// TODO Auto-generated method stub
		
	}

	public int getId_cliente() {
		// TODO Auto-generated method stub
		return 0;
	}

}

	
	
	

