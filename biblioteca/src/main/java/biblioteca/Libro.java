package biblioteca;

public class Libro {
	private String titulo;
	private int isbn;
	private int fechaPub;
	private String autor;
	
	public Libro(String titulo ,int isbn, int fechaPub, String autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.fechaPub = fechaPub;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getFechaPub() {
		return fechaPub;
	}

	public String getAutor() {
		return autor;
	}
	
	
}
