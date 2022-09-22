package crud;

import java.util.Scanner;

import modelo.Login;
import DAO.LoginDAO;
import modelo.Clientes;
import DAO.ClientesDAO;


public class ClientesCRUD {

	public static void main(String[] args) {

		ClientesDAO clientesDAO = new ClientesDAO();
		LoginDAO loginDAO = new LoginDAO();
		
		
		Scanner in = new Scanner(System.in);
		int oP = 0;
		
	
		
		int id_cliente = 0;
		String cpf_cliente = "";
		String nome_cliente = "";
		String email_cliente = "";
		int id_login = 0;
		

		do {
			System.out.println("=== Clientes CRUD ===");
			System.out.println("1 - Cadastrar novo cliente");
			System.out.println("2 - Consultar clientes cadastrados");
			System.out.println("3 - Atualizar dados cliente");
			System.out.println("4 - Deletar cliente");
			System.out.println("5 - Buscar por ID");
			System.out.println("0 - Sair");
			oP = in.nextInt();

			switch (oP) {
			case 1:{
				
				
				
				System.out.println("Digite o CPF: ");
				in.nextLine();
				cpf_cliente = in.nextLine();
				
				System.out.println("Digite o nome do cliente: ");
				
				nome_cliente = in.nextLine();
				
				System.out.println("Digite o email do cliente: ");
				email_cliente = in.nextLine();
				
				System.out.println("Digite o id de login: ");
				id_login = in.nextInt();
				
		     
				Login login = loginDAO.getLoginById(id_login);
		     	
				Clientes cliente1 = new Clientes(id_cliente,cpf_cliente,nome_cliente,email_cliente,login);
				clientesDAO.save(cliente1);
				
				System.out.println(" Cadastro realizado com sucesso! ");
				break;
			}

			case 2:{
				try {
					id_cliente = in.nextInt();
					
					clientesDAO.deleteById(id_cliente);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum login para excluir ");
				}

				break;
			}

			case 3:{
				System.out.println("Informe o ID do Cliente para atualizar: ");
				id_cliente = in.nextInt();
				System.out.println("Digite o ID Login: ");
				id_login = in.nextInt();
				
				Login login1 = loginDAO.getLoginById(id_login);
				
				System.out.println("Digite o nome do cliente: ");
				nome_cliente = in.next();
			
				System.out.println("Informe o CPF: ");
				cpf_cliente = in.next();
			
				System.out.println("Digite o email do cliente: ");
				email_cliente = in.next();
				
				
				
			
				Clientes cliente = new Clientes(id_cliente, email_cliente, nome_cliente, cpf_cliente, login1);
				clientesDAO.update(cliente);
				System.out.println("Informações atualizadas!");
				break;
			}

			case 4:{
				for (Clientes c : clientesDAO.getClientes()) { 
					System.out.println("Id_cliente: " + c.getId_cliente());
					System.out.println("Email_cliente: " + c.getEmail_cliente());
					System.out.println("Nome_cliente: " + c.getNome_cliente());
					System.out.println("Cpf_cliente: " + c.getCpf_cliente());
					

					System.out.println("----------------------------------- ");
				}
				break;
			}
			

			case 5:{
				System.out.println("Digite o ID do cliente: ");
				int id_cliente1 = in.nextInt();
				
				Clientes cliente3 = clientesDAO.getClientesById(id_cliente1);

				System.out.println("ID: " + cliente3.getId_cliente() + 
						"Nome: " + cliente3.getNome_cliente() + 
						"Tipo de cadastro: "+ cliente3.getLogin().getTipo_login() + 
						"Email cadastrado: " + cliente3.getEmail_cliente() + 
						"CPF: "+ cliente3.getCpf_cliente());
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
		} while (oP != 6);

		in.close();

	}

		
	}

	

