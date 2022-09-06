package crud;
import java.util.Scanner;


import modelo.Login;



public class LoginDAO {

	public static void main(String args[]) {

		LoginDAO LoginDAO = new LoginDAO();
		

		Scanner entrada = new Scanner(System.in);
		int id_login = 0;
		String tipo_login = "";
		

		int opcao;
		do {

			System.out.println("===== Cliente Crud =====");
			System.out.println("1 - Cadastro de contato");
			System.out.println("2 - Excluir contato");
			System.out.println("3 - Atualizar contato");
			System.out.println("4 - Mostrar contatos");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			
			switch (opcao) {
			case 1: {
				System.out.println("Digite o Id_login: ");
				id_login = entrada.nextInt();
				

				System.out.println("Digite o tipo do Login: ");
				tipo_login = entrada.next();
				
				Login login1 = new Login(id_login, tipo_login);
			


				LoginDAO.save(login1);
				break;
			}
			case 2: {
				System.out.println("Digite o id login  para exclusao: ");
				try {
					id_login = entrada.nextInt();
					
					LoginDAO.removeById(id_login);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum login para excluir ");
				}

				break;
			}
			case 3: {

		
					System.out.println("Digite o Id_login: ");
					id_login = entrada.nextInt();
					

					System.out.println("Digite o tipo do Login: ");
					tipo_login = entrada.next();
					
					Login login1 = new Login(id_login, tipo_login);
				


					LoginDAO.update(login1);
					break;
				}
			case 4: {
				for (Login c : LoginDAO.getLogin()) {
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

				c = LoginDAO.getLoginById(id);

				System.out.println("Id_login: " + c.getId_login());
				System.out.println("Tipo_login: " + c.getTipo_login());
				
				
				System.out.println("----------------------------------- ");
			}
				break;

			case 6: {
				System.out.println(" === Obrigado por usar a nossa Agencia === ");
				break;
			}
			default:
				System.out.println("Opcao invalida: ");

			}
			;
		} while (opcao != 6);

		entrada.close();

	}

	private Login getLoginById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Login[] getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	private void update(Login login1) {
		// TODO Auto-generated method stub
		
	}

	private void removeById(int id_login) {
		// TODO Auto-generated method stub
		
	}

	private void save(Login login1) {
		// TODO Auto-generated method stub
		
	}
}
