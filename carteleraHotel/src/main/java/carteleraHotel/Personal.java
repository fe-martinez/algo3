package carteleraHotel;

import java.util.Scanner;

public class Personal extends Usuario{

	public Personal(String nombre, String password) {
		super(nombre, password);
	}
	
	public Usuario crearCuenta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un nombre de usuario: ");
		String username = sc.nextLine();
		System.out.println("Ingrese una contraseña: ");
		String password = sc.nextLine();
		
		Usuario nuevo = new Usuario(username, password);
		return nuevo;
	}

}
