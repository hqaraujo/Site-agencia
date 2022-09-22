package crud;
import java.util.Scanner;


import modelo.Login;
import DAO.LoginDAO;






public class LoginCRUD {

	public static void main(String args[]) {

		LoginDAO loginDAO = new LoginDAO();
		

		Scanner entrada = new Scanner(System.in);
		int id_login = 0;
		String tipo_login = "";
		

		int opcao;
		do {

			System.out.println("===== Login Crud =====");
			System.out.println("1 - Cadastro login");
			System.out.println("2 - Excluir login");
			System.out.println("3 - Atualizar login");
			System.out.println("4 - Mostrar login");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			
			switch (opcao) {
			case 1: {
				System.out.println("Digite o id_login: ");
				id_login = entrada.nextInt();
				
				System.out.println("Digite o tipo_login: ");
				tipo_login = entrada.next();
				
				Login login1 = new Login(id_login, tipo_login);
			


				loginDAO.save(login1);
				break;
			}
			
			case 2: {
				System.out.println("Digite o id login  para exclusao: ");
				try {
					id_login = entrada.nextInt();
					
					loginDAO.deleteById(id_login);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum login para excluir ");
				}

				break;
			}
			case 3: {

		
					System.out.println("Digite o id_login: ");
					id_login = entrada.nextInt();
					

					System.out.println("Digite o tipo do Login: ");
					tipo_login = entrada.next();
					
					Login login1 = new Login(id_login, tipo_login);
				


					loginDAO.update(login1);
					break;
				}
			case 4: {
				for (Login c : loginDAO.getLogin()) {
					System.out.println("Id_login: " + c.getId_login());
					System.out.println("Tipo_login: " + c.getTipo_login());
					

					System.out.println("----------------------------------- ");
				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID para buscar: ");
				int id = entrada.nextInt();
				
				Login c = new Login();

				c = loginDAO.getLoginById(id);

				System.out.println("idLogin: " + c.getId_login
						());
				System.out.println("topoLogin: " + c.getTipo_login());
				
				
				System.out.println("----------------------------------- ");
			}
				break;

			case 6: {
				System.out.println(" === Obrigado por usar o nosso Site === ");
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

	

