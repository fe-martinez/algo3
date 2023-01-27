package biblioteca;
import java.util.ArrayList;

public class Cliente{
	private String nombre;
	private int id;
	private ArrayList<Libro> librosPrestados;
	
	public Cliente(String nombre, int id, ArrayList<Libro> librosPrestados){
		this.nombre = nombre;
		this.id = id;
		this.librosPrestados = librosPrestados;
	}
	
	public boolean recibirLibro(Libro libro) {
		librosPrestados.add(libro);
		return true;
	}
	
	public Libro devolverLibro() {
		if(librosPrestados.isEmpty()) {
			return null;
		}
		
		Libro aDevolver = librosPrestados.get(0);
		librosPrestados.remove(0);
		return aDevolver;
	}
}
