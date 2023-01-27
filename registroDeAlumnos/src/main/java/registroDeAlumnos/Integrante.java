package registroDeAlumnos;

public class Integrante {
	private String nombre;
	private int padron;
	private int dni;
	
	public Integrante(String nombre, int padron, int dni) {
		this.nombre = nombre;
		this.padron = padron;
		this.dni = dni;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre + ", Padrón: " + this.padron);
	}
}

