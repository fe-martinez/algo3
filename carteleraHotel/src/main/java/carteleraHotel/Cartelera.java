package carteleraHotel;

import java.util.HashMap;
import java.util.Scanner;

public class Cartelera {
	HashMap<String ,Usuario> usuarios;
	HashMap<String, Personal> personal;
	String userLogeado;
	boolean esPersonal;
	
	public Cartelera() {
		this.usuarios = new HashMap<String, Usuario>();
		this.personal = new HashMap<String, Personal>();
		this.userLogeado = null;
		boolean esPersonal = false;
	}
	
	private Usuario buscarUser(String nombre) {
		for (HashMap.Entry<String, Usuario> pair: usuarios.entrySet()) {
			if(pair.getValue().getNombre() == nombre) {
				return pair.getValue();
			}
		}
		return null;
	}
	
	
	public void logear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre de usuario:");
		String username = sc.nextLine();
		System.out.println("Ingrese su contraseña:");
		String password = sc.nextLine();
		
		for (HashMap.Entry<String, Usuario> pair: usuarios.entrySet()) {
			if(pair.getValue().validar(username, password)) {
				this.userLogeado = pair.getKey();
				this.esPersonal = false;
				return;
			}
        }
		for (HashMap.Entry<String, Personal> pair: personal.entrySet()) {
			if(pair.getValue().validar(username, password)) {
				this.userLogeado = pair.getKey();
				this.esPersonal = true;
				return;
			}
        }
		System.out.println("El usuario o la contraseña son incorrectos.");
	}
	
	public void logout() {
		this.userLogeado = null;
	}
	
	public void comando() {
		Scanner sc = new Scanner(System.in);
		System.out.println("E para ver la bandeja de entrada.\nM para mandar un nuevo mensaje.\nS para ver la bandeja de salida.\nL para logout\nOpcion: ");
		char opcion = sc.next().charAt(0);
		
		Usuario actual = buscarUser(this.userLogeado);
		if(actual == null) {
			System.out.println("Error"); //No hay manera de llegar a este caso de todas formas :p.
			return;
		}
		
		if(opcion == 'E') {
			actual.mostrarMensajes();
		} else if(opcion == 'M') {
			System.out.println("Destinatario: ");
			String username = sc.nextLine();
			Usuario destinatario = buscarUser(username);
			if(destinatario == null) {
				System.out.println("El usuario no existe");
				return;
			}
			destinatario.recibirMensaje(actual.enviarMensaje());
		} else if(opcion == 'S') {
			actual.mostrarMensajesSalida();
		} else if(opcion == 'L') {
			logout();
		} else {
			System.out.println("Error");
		}
	}
	
	public void usar() {
		if(this.userLogeado == null) {
			logear();
		} else {
			comando();
		}
	}
	
	public void crearUsuarioDesdeMain(String nombre, String password) {
		Usuario nuevo = new Usuario(nombre, password);
		this.usuarios.put(nombre, nuevo);
	}
	
	
	
}
