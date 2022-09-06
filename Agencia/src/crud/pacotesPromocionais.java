import java.util.Date;
import java.util.Scanner;

public class Login {

	public static void main(String args[]) {

		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();

		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		String nome = "";
		int idade = 0;
		int codigo = 0;

		do {

			System.out.println("===== Agenda =====");
			System.out.println("1 - Cadastro de contato");
			System.out.println("2 - Excluir contato");
			System.out.println("3 - Atualizar contato");
			System.out.println("4 - Mostrar contatos");
			System.out.println("5 - Buscar por ID");
			System.out.println("6 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o nome do contato: ");
				nome = entrada.next();
				contato.setNome(nome);

				System.out.println("Digite a idade do contato: ");
				idade = entrada.nextInt();
				contato.setIdade(idade);

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
