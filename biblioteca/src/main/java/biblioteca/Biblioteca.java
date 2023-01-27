package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> stockLibros;
	private ArrayList<Cliente> clientes;
	
	public Biblioteca(ArrayList<Libro> stockLibros, ArrayList<Cliente> clientes) {
		this.stockLibros = stockLibros;
		this.clientes = clientes;
	}
	
	public boolean agregarLibro(Libro libro) {
		stockLibros.add(libro);
		return true;
	}
	
	public boolean quitarLibro(Libro libro) {
		if(!stockLibros.contains(libro)) {
			return false;
		}
		stockLibros.remove(libro);
		return true;
	}
	
	public Libro buscarLibro(int isbn){
		for(int i = 0; i < stockLibros.size(); i++) {
			Libro actual = stockLibros.get(i);
			if(actual.getIsbn() == isbn) {
				return actual;
			}
		}
		return null;
	}
	
	public boolean agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		return true;
	}
	
	public boolean prestarLibro(int isbn, Cliente cliente) {
		Libro aPrestar = buscarLibro(isbn);
		if(aPrestar == null) {
			return false;
		}
		
		cliente.recibirLibro(aPrestar);
		stockLibros.remove(aPrestar);
		return true;
	}
	
	public boolean recuperarLibro(Cliente cliente) {
		Libro recuperado = cliente.devolverLibro();
		if(recuperado == null) {
			return false;
		}
		
		stockLibros.add(recuperado);
		return true;
	}
	
}
