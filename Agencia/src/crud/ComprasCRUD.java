package crud;

import java.util.Date;
import java.util.Scanner;

import DAO.ClientesDAO;
import DAO.ComprasDAO;
import DAO.DestinoDAO;
import modelo.Clientes;
import modelo.Compras;
import modelo.Destino;

@SuppressWarnings("unused")
public class ComprasCRUD {

	public static void main(String args[]) {

		DestinoDAO destinoDAO = new DestinoDAO();
		ClientesDAO clientesDAO = new ClientesDAO();
		ComprasDAO comprasDAO = new ComprasDAO();

		Scanner in = new Scanner(System.in);
		int oP = 0;
		int posicao = 0;

		
		double valor_total = 0;
		String forma_pagamento = "";
		double valor = 0;
		String data_compras = "";
		int id_compra = 0;
		int id_cliente = 0;
		int id_destino = 0;

		do {

			System.out.println("===== Compras CRUD=====");
			System.out.println("1 - Cadastro nova compra");
			System.out.println("2 - consultar compra");
			System.out.println("3 - Atualizar compra");
			System.out.println("4 - Deletar contatos");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			oP = in.nextInt();

			switch (oP) {
			case 1:{
				System.out.println("Digite o ID do destino: ");
				id_destino = in.nextInt();
				System.out.println("Digite o ID do cliente: ");
				id_cliente = in.nextInt();
				System.out.println("Digite o valor total: ");
				valor_total = in.nextDouble();
				System.out.println("Digite a Forma de pagamento: ");
				forma_pagamento = in.next();
				System.out.println("Digite o valor : ");
				valor = in.nextDouble();
				System.out.println("Digite a data da compra: ");
				data_compras = in.next();

				Destino destino = destinoDAO.getDestinoById(id_destino);
				Clientes cliente = clientesDAO.getClientesById(id_cliente);
				Compras compras1 = new Compras(id_compra, data_compras, valor, data_compras, id_destino, cliente, destino, null);
				comprasDAO.save(compras1);

				System.out.println(" Cadastro realizado ");
				break;
			}

			case 2: {
				for (Compras compras : comprasDAO.getCompras1()) {
					System.out
							.println("ID: " + compras.getId_compras() + "Pacote: " + compras.getDestino().getId_destino()
									+ "ID Cliente: " + compras.getClientes().getId_cliente() + "Valor total: "
									+ compras.getValor_total() + "Forma de pagamento: " + compras.getForma_pagamento()
									+ "Valor " + compras.getValor() + "Data compras: " + compras.getData_compras());
				}
				System.out.println("Consulta finalizada");
				break;
			}
			case 3:{

				System.out.println("Digite ID da destino ");
				id_destino = in.nextInt();

				System.out.println("Digite o ID do cliente ");
				id_cliente = in.nextInt();

				System.out.println("Digite o valor total ");
				valor_total = in.nextDouble();

				System.out.println("Digite a forma de pagamento: ");
				forma_pagamento = in.next();

				System.out.println("Digite o valor: ");
				valor = in.nextDouble();

				System.out.println("Digite a data da compra: ");
				data_compras = in.next();

				Destino destino1 = destinoDAO.getDestinoById(id_destino);
				Clientes cliente1 = clientesDAO.getClientesById(id_cliente);

				Compras compras1 = new Compras(id_compra, destino1, cliente1, valor_total, forma_pagamento, valor, data_compras);
				comprasDAO.update(compras1);
				System.out.println("Informações atualizadas!");
				break;
			}

			case 4:{
				System.out.println("Digite o ID da compra: ");
				posicao = in.nextInt();
				comprasDAO.deleteById(posicao);
				break;
			}

			case 5:{

				System.out.println("Digite o ID da compra: ");
				posicao = in.nextInt();

				Compras compras3 = comprasDAO.getComprasById(posicao);

				System.out.println("ID: " + ((Compras) compras3).getId_compras() + "Destino: "
						+ compras3.getDestino().getId_destino() + "ID Cliente: " + compras3.getClientes().getClientes()
						+ "Valor total: " + compras3.getValor_total() + "Forma pagamento: "
						+ compras3.getForma_pagamento() + "Valor: " + compras3.getValor_total() + "Data compra: "
						+ compras3.getData_compras());
				break;
			}

			default:
				System.out.println(oP != 0 ? "Opção inválida, tente novamente." : "");
				break;
			}
		} while (oP != 6);

		System.out.println("Finalizado.");
		in.close();
	}

}
