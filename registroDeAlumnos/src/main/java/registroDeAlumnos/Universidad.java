package registroDeAlumnos;

import java.util.HashMap;
import java.util.Iterator;


public class Universidad {
	HashMap<Integer, Alumno> alumnos;
	HashMap<Integer, Docente> docentes;
	
	public Universidad(HashMap<Integer, Alumno> alumnos, HashMap<Integer, Docente> docentes) {
		this.alumnos = new HashMap<Integer, Alumno>();
		this.docentes = new HashMap<Integer, Docente>();
	}
	
	public boolean darAlta(String nombre, Integer dni, boolean esAlumno) {
		if(alumnos.containsKey(dni) || docentes.containsKey(dni)) {
			System.out.println("El DNI ya se encuentra inscripto!");
			return false;
		}
		
		if(esAlumno) {
			Alumno nuevo = new Alumno(nombre, alumnos.size() + 1, dni);
			alumnos.put(dni, nuevo);
		} else {
			Docente nuevo = new Docente(nombre, docentes.size() + 1, dni);
			docentes.put(dni, nuevo);
		}
		return true;
	}
	
	//Funcionan ambos, uno con iterador externo otro con forEach
	public void listarAlumnos() {
		for (HashMap.Entry<Integer, Alumno> pair: alumnos.entrySet()) {
	        pair.getValue().mostrarDatos();
		}
	}
	
	public void listarDocentes() {
		Iterator<Integer> iterador = docentes.keySet().iterator();
		while(iterador.hasNext()) {
			var keyActual = iterador.next();
			Docente actual = docentes.get(keyActual);
			actual.mostrarDatos();
		}
	}
	
	
	
	
	
}
