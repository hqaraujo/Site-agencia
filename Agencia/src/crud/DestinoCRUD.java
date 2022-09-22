package crud;

import java.util.Scanner;

import DAO.DestinoDAO;
import DAO.PacotesPDAO;


import modelo.Pacotes;
import modelo.Destino;

@SuppressWarnings("unused")
public class DestinoCRUD {

	public static void main(String args[]) {

		DestinoDAO destinoDAO = new DestinoDAO();
		Scanner entrada = new Scanner(System.in);

		

		int id_destino = 0;
		String pais = "";
		String cidade = "";
		
		int id_pacote = 0;

		int opcao;
		do {

			System.out.println("===== Destino  CRUD=====");
			System.out.println("1 - Cadastro de Destino");
			System.out.println("2 - Excluir destino");
			System.out.println("3 - Atualizar destino");
			System.out.println("4 - Mostrar destinos");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {

				System.out.println("Digite o pais: ");
				pais = entrada.next();

				System.out.println("Digite a cidade: ");
				cidade = entrada.next();

				Destino destino = new Destino(id_destino, pais, cidade);
				destinoDAO.save(destino);
				System.out.println(" Cadastro realizado ");
				break;
			}
			case 2: {
				System.out.println("Digite o codigo do destino para exclusao: ");
				try {
					id_destino = entrada.nextInt();

					destinoDAO.deleteById(id_destino);

				} catch (Exception e) {
					// e.getMessage();

					System.out.println(" Nenhum contato para excluir ");
				}

				break;
			}
			case 3: {

				System.out.println("Digite o ID do destino: ");
				id_destino = entrada.nextInt();
				System.out.println("Digite o pais: ");
				pais = entrada.toString();
				System.out.println("digite a cidade: ");
				cidade = entrada.toString();

				Destino destino = new Destino(id_destino, pais, cidade);
				destinoDAO.update(destino);

				break;
			}
			case 4: {
				for (Destino c : destinoDAO.getDestino()) {
					System.out.println("id_destino: " + c.getId_destino());
					System.out.println("pais: " + c.getPais());
					System.out.println("cidade: " + c.getCidade());

					System.out.println("----------------------------------- ");
				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID para buscar: ");
				int id = entrada.nextInt();

				Destino c = new Destino();

				c = destinoDAO.getDestinoById(id);

				System.out.println("id_destino: " + c.getId_destino());
				System.out.println("Pais: " + c.getPais());
				System.out.println("Cidade: " + c.getCidade());

				System.out.println("----------------------------------- ");
			}
				break;

			case 6: {
				System.out.println(" === Obrigado por usar nossa Agencia === ");
				break;
			}
			default:
				System.out.println("Opcao invalida: ");

			}
			;
		} while (opcao != 6);

		entrada.close();

	}

}
