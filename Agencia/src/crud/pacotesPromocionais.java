package crud;
import java.util.Date;
import java.util.Scanner;

import DAO.PacotesPDAO;
import modelo.Pacotes;

public class pacotesPromocionais {

	public pacotesPromocionais() {
		// TODO Auto-generated constructor stub
	}

	public pacotesPromocionais(int id_pacote, String origem, double promocao, double destino) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		PacotesPDAO pacotesPDAO = new PacotesPDAO();
		Pacotes pacotesP = new Pacotes();

		Scanner entrada = new Scanner(System.in);
		int id_pacote = 0;
		String origem = "";
		double promocao = 0;
		double destino = 0;

		int opcao;
		do {

			System.out.println("===== Pacotes Promocionais =====");
			System.out.println("1 - Cadastro ");
			System.out.println("2 - Excluir cadastro");
			System.out.println("3 - Atualizar cadastro");
			System.out.println("4 - Mostrar cadatros");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o id  pacote: ");
				id_pacote = entrada.nextInt();
				pacotesP.setId_pacote(id_pacote);
				
				System.out.println("Digite a origem: ");
				origem = entrada.toString();
				pacotesP.setOrigem(origem);


				System.out.println("Digite a promocao: ");
				promocao = entrada.nextDouble();
				pacotesP.setPromocao(promocao);
				
				System.out.println("Digite o destino: ");
				destino = entrada.nextDouble();
				pacotesP.setDestino(destino);

				pacotesP.setDestino(new Date());
				
				pacotesPromocionais pacotesP1 = new pacotesPromocionais(id_pacote, origem, promocao, destino);

				pacotesP1.save(pacotesP1);
				break;
			}
			case 2: {
				System.out.println("Digite o codigo do contato para exclusao: ");
				try {
					id_pacote = entrada.nextInt();
					
					pacotesP.removeById(id_pacote);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum id_pacote para excluir ");
				}

				break;
			}
			case 3: {

				System.out.println("Digite o id_pacote para atualizar: ");
				id_pacote = entrada.nextInt();

				System.out.println("Digite o novo id_pacote: ");
				id_pacote = entrada.nextInt();
				pacotesP.setId_pacote(id_pacote);

				System.out.println("Digite a nova origem: ");
				origem = entrada.toString();
				pacotesP.setOrigem(origem);

				pacotesP.setDestino(new Date());

				pacotesP.setId(id_pacote);

				pacotesPDAO.update(pacotesP);
			}
			case 4: {
				for (Pacotes c : pacotesPDAO.getPacotes()) {
					System.out.println("Id_pacote: " + c.getId_pacote());
					System.out.println("Origen: " + c.getOrigem());
					System.out.println("Promocao: " + c.getPromocao());
					System.out.println("Destino: " + c.getDestino());

					System.out.println("----------------------------------- ");
				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID para buscar: ");
				int id = entrada.nextInt();
				
				pacotesPromocionais c = new pacotesPromocionais();

				c = pacotesPDAO.getId_pacoteById(id);

				System.out.println("Id_pacote: " + c.getId_pacote());
				System.out.println("Origem: " + c.getOrigem());
				System.out.println("Promocao: " + c.getPromocao());
				System.out.println("Destino: " + c.getDestino());

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

	private String getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getPromocao() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getOrigem() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getId_pacote() {
		// TODO Auto-generated method stub
		return null;
	}

	private void save(pacotesPromocionais pacotesP1) {
		// TODO Auto-generated method stub
		
	}
}
