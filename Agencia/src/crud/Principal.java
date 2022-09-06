package crud;

import modelo.Login;
import modelo.Clientes;

public class Principal {

	public static void main(String[] args) {
		
		Login p1 = new Login(1, "comum");
		Login p2 = new Login(2, "administrador");
		
		Clientes u1 = new Clientes(1, " maria@email.com", "1234 ", " 453086 ", p1);
		Clientes u2 = new Clientes(2, "joao@email.com", "7421 ", "588912", p2);
		Clientes u3 = new Clientes(3, "paulo@email.com", "1422 ", "028851", p1);
		
		//u1.setEmail("maria@email.com");
		//u2.setEmail("joao@email.com");
		//u3.setEmail("paulo@email.com");
		
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		
	} 

}