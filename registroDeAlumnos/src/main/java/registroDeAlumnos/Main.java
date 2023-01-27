package registroDeAlumnos;

public class Main {

	public static void main(String[] args) {
		Universidad fiuba = new Universidad(null, null);
		
		fiuba.darAlta("Clara", 123, true);
		fiuba.darAlta("Francisco", 124, true);
		fiuba.darAlta("Fernando", 125, false);
		fiuba.darAlta("Juanelo", 121, true);
		fiuba.darAlta("Martin", 120, false);
		fiuba.darAlta("Juanelo2", 121, false);
		
		System.out.println("Alumnis: ");
		fiuba.listarAlumnos();
		System.out.println("-----------------------------\nDocentes:");
		fiuba.listarDocentes();
	}

}
