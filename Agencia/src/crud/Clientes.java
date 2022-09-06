package crud;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

	public static void main(String args[]) {

		
		Scanner in = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		
		
		int id_cliente = 0;
		String email_cliente = " ";
	    String nome_cliente = "";
        String cpf_cliente = "";
        
        ArrayList<Clientes> clientes = new ArrayList<Clientes>();

		do {

			System.out.println("===== Crud Clientes =====");
			System.out.println("1 - Cadastrar dados Cliente");
			System.out.println("2 - Buscar cadastro cliente");
			System.out.println("3 - Atualizar Dados");
			System.out.println("4 - Delete Cliente");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = in.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o nome do cliente: ");
				nome_cliente = in.nextLine();

				System.out.println("Digite a CPF: ");
				cpf_cliente = in.nextLine();
				((Object) clientes).setCliente(clientes);

				contato.setDataCadastro(new Date());

				contatoDAO.save(contato);
				break;
			}
			case 2: {
				System.out.println("Digite o codigo do contato para exclusao: ");
				try {
					codigo = entrada.nextInt();
					
					contatoDAO.removeById(codigo);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum contato para excluir ");
				}

				break;
			}
			case 3: {

				System.out.println("Digite o codigo do contato para atualizar: ");
				codigo = entrada.nextInt();

				System.out.println("Digite o novo nome do contato: ");
				nome = entrada.next();
				contato.setNome(nome);

				System.out.println("Digite a nova idade do contato: ");
				idade = entrada.nextInt();
				contato.setIdade(idade);

				contato.setDataCadastro(new Date());

				contato.setId(codigo);

				contatoDAO.update(contato);
			}
			case 4: {
				for (Contato c : contatoDAO.getContatos()) {
					System.out.println("NOME: " + c.getNome());
					System.out.println("IDADE: " + c.getIdade());
					System.out.println("DATA CADASTRO: " + c.getDataCadastro());

					System.out.println("----------------------------------- ");
				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID para buscar: ");
				int id = entrada.nextInt();
				
				Contato c = new Contato();

				c = contatoDAO.getContatoById(id);

				System.out.println("NOME: " + c.getNome());
				System.out.println("IDADE: " + c.getIdade());
				System.out.println("DATA CADASTRO: " + c.getDataCadastro());

				System.out.println("----------------------------------- ");
			}
				break;

			case 6: {
				System.out.println(" === Obrigado por usar nossa Agenda === ");
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
