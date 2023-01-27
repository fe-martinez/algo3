package biblioteca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Libro harryPotter = new Libro("Harry Potter and the Philosopher's Stone", 45, 1997, "J. K. Rowling");
		Libro principito = new Libro("The Little Prince", 22, 1943, "Antoine de Saint-Exupery");
		Libro hobbit = new Libro("The Hobbit", 98, 1937, "J. R. R. Tolkien");
		Libro alquimista = new Libro("The Alchemist", 2, 1988, "Paulo Coelho");
		
		Cliente carlitos = new Cliente("Carlos", 1, new ArrayList<Libro>());
		
		Biblioteca biblio = new Biblioteca(new ArrayList<Libro>() , new ArrayList<Cliente>());
		
		biblio.agregarLibro(alquimista);
		biblio.agregarLibro(hobbit);
		biblio.agregarLibro(principito);
		biblio.agregarLibro(harryPotter);
		
		//Busco el alquimista.
		Libro buscado = biblio.buscarLibro(2);
		System.out.println(buscado.getTitulo());
		System.out.println(buscado.getAutor());
		
		//Presto el alquimista.
		biblio.agregarCliente(carlitos);
		biblio.prestarLibro(2, carlitos);
		
		Libro buscado2 = biblio.buscarLibro(2);
		if(buscado2 == null) {
			System.out.println("El libro buscado no esta en stock :(");
		} else {			
			System.out.println(buscado2.getTitulo());
			System.out.println(buscado2.getAutor());
		}
		
		//Devuelvo el alquimista.
		biblio.recuperarLibro(carlitos);
		Libro buscado3 = biblio.buscarLibro(2);
		if(buscado3 == null) {
			System.out.println("El libro buscado no esta en stock :(");
		} else {			
			System.out.println(buscado3.getTitulo());
			System.out.println(buscado3.getAutor());
		}
		
	}
}
