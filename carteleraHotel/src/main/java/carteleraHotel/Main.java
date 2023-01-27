package carteleraHotel;

public class Main {

	public static void main(String[] args) {
		Cartelera cartelera = new Cartelera();
		
		cartelera.crearUsuarioDesdeMain("fran", "fran");
		cartelera.crearUsuarioDesdeMain("clara", "clara");
		
		while(true) {
			cartelera.usar();
		}
	}

}
