package carteleraHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private String password;
	private ArrayList<Mensaje> mensajesEntrantes;
	private ArrayList<Mensaje> mensajesSalientes;
	
	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
		this.mensajesEntrantes = new ArrayList<Mensaje>();
		this.mensajesSalientes = new ArrayList<Mensaje>();
	}
	
	public boolean validar(String nombre, String password) {
		if((nombre == this.nombre) && (password == this.password)) {
			return true;
		}
		return false;
	}
	
	public void recibirMensaje(Mensaje mensaje) {
		mensajesEntrantes.add(mensaje);
	}
	
	public Mensaje enviarMensaje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su mensaje: ");
		String texto = sc.nextLine();
		Mensaje nuevo = new Mensaje(texto, this.nombre, 0);
		mensajesSalientes.add(nuevo);
		return nuevo;
	}
	
	public void mostrarMensajes(){
		for(Mensaje actual :this.mensajesEntrantes) {
			actual.mostrarMensaje();
		}
	}
	
	public void mostrarMensajesSalida() {
		for(Mensaje actual :this.mensajesSalientes) {
			actual.mostrarMensaje();
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
