package crud;

import java.util.Scanner;

import DAO.DestinoDao;


public class Destino {

	public Destino() {
		// TODO Auto-generated constructor stub
	}

	public Destino(int id_destino, String pais, String cidade) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		DestinoDao destinoDAO = new DestinoDao();
		Destino destino = new Destino();

		Scanner entrada = new Scanner(System.in);
		int id_destino = 0;
		String pais = "";
		String cidade = "";
		

		int opcao;
		do {

			System.out.println("===== Destino =====");
			System.out.println("1 - Cadastro de Destino");
			System.out.println("2 - Excluir destino");
			System.out.println("3 - Atualizar destino");
			System.out.println("4 - Mostrar destinos");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o Id_destino: ");
				id_destino = entrada.nextInt();
				

				System.out.println("Digite o pais: ");
				pais = entrada.next();
				
				System.out.println("Digite a cidade: ");
				cidade = entrada.next();
				
				Destino destino1 = new Destino(id_destino, pais, cidade);
			


				destinoDAO.save(destino1);
				break;
			}
			case 2: {
				System.out.println("Digite o codigo do destino para exclusao: ");
				try {
					id_destino = entrada.nextInt();
					
					destinoDAO.removeById(id_destino);
					
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum contato para excluir ");
				}

				break;
			}
			case 3: {

				System.out.println("Digite o codigo do destino para atualizar: ");
				id_destino = entrada.nextInt();

				System.out.println("Digite o novo  id_destino: ");
				id_destino = entrada.nextInt();
				destino.setId_destino(id_destino);

				System.out.println("Digite o novo Pais: ");
				pais = entrada.toString();
				destino.setPais(pais);
				
				System.out.println("Digite a nova Cidade: ");
				cidade = entrada.toString();
				destino.setCidade(cidade);


				destino.setPais(pais);
				
				destino.setCidade(cidade);

				destino.setId_destino(id_destino);

				destinoDAO.update(destino);
			}
			case 4: {
				for (modelo.Destino c : destinoDAO.getDestino()) {
					System.out.println("id_destino: " + c.getDestino());
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

				c = destinoDAO.getId_destinoById(id);

				System.out.println("Id_destino: " + c.getId_destino());
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

	private String getId_destino() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCidade() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPais1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPais() {
		// TODO Auto-generated method stub
		return null;
	}

	public modelo.Destino getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId_destino(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setPais(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCidade(String string) {
		// TODO Auto-generated method stub
		
	}
}
