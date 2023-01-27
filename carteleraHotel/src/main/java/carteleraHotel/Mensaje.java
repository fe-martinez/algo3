package carteleraHotel;

public class Mensaje {
	private String mensaje;
	private String autor;
	private int hora;
	
	public Mensaje(String mensaje, String autor, int hora) {
		this.mensaje = mensaje;
		this.autor = autor;
		this.hora = hora;
	}
	
	public void mostrarMensaje() {
		System.out.println(autor + ":" + mensaje);
	}

	public int getHora() {
		return hora;
	}
}
