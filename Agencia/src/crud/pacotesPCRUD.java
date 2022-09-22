package crud;

import java.util.Scanner;

import DAO.PacotesPDAO;

import modelo.Pacotes;

public class pacotesPCRUD {
	
	
	public static void main(String[] args) {

		PacotesPDAO pacotePDAO = new PacotesPDAO();
		Scanner in = new Scanner(System.in);
		
		
	

		int id_pacote = 0;
	    String origem = "";
		double promocao = 0;
		

		int opcao;
		do {
			System.out.println("=== Pacotes CRUD ===");
			System.out.println("1 - Cadastrar novo Pacote de Viagem");
			System.out.println("2 - Consultar pacotes cadastrados");
			System.out.println("3 - Atualizar um pacote");
			System.out.println("4 - Deletar pacotes");
			System.out.println("5 - Buscar por ID");
			System.out.println("0 - Sair");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:{
				
				System.out.println("Digite a origem: ");
				origem = in.next();
				System.out.println("Valor promocao ");
				promocao = in.nextDouble();
				
				Pacotes pacotes = new Pacotes(id_pacote, origem, promocao);
				
				pacotePDAO.save(pacotes);

				System.out.println(" Cadastro realizado ");
				break;
			}
			case 2: {
				System.out.println("Digite o id Pacote para exclusao: ");
				try {
					id_pacote = in.nextInt();
					
					pacotePDAO.deleteById(id_pacote);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum login para excluir ");
				}

				break;
			}

			case 3:{
				
				System.out.println("Digite o ID do pacote para atualaizar : ");
				id_pacote = in.nextInt();
				System.out.println("Digite a Cidade de origem: ");
				origem = in.toString();
				System.out.println("Digite a promocao: ");
				promocao = in.nextDouble();
				


				Pacotes pacotes2 = new Pacotes(id_pacote, origem, promocao);
				pacotePDAO.update(pacotes2);
				System.out.println("Informações atualizadas!");
				break;
			}

			case 4:{
				for (Pacotes c : pacotePDAO.getPacotes()) {
					System.out.println("Id_login: " + c.getId_pacote());
					System.out.println("Origem: " + c.getOrigem());
					System.out.println("Promocao: " + c.getPromocao());
					

					System.out.println("----------------------------------- ");
				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID para buscar: ");
				int id = in.nextInt();
				
				Pacotes c = new Pacotes();

				c = pacotePDAO.getPacotesById(id);

				System.out.println("id_pacote: " +  c.getId_pacote());
						
				System.out.println("origem: " + c.getOrigem());
				
				System.out.println("Promocao: " + c.getPromocao());
				
				
				System.out.println("----------------------------------- ");
			
				break;
			}
			case 6: {
				System.out.println(" === Obrigado por usar o nosso Site === ");
				break;
			}
			default:
				System.out.println("Opcao invalida: ");

			}
			;
		} while (opcao != 6);

		in.close();

	}

		
	}

