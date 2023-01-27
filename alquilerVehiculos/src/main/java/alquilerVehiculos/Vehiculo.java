package alquilerVehiculos;

public abstract class Vehiculo {
	private String modelo;
	private String patente;
	
	public Vehiculo(String modelo, String patente) {
		this.modelo = modelo;
		this.patente = patente;
	}
	
	public int calcularAlquiler(int dias) {
		return 0;
	}
	
	public void emitirPresupuesto(int dias) {
		int costo = calcularAlquiler(dias);
		System.out.println("======================================================================");
		System.out.println("El costo de alquilar el vehiculo " + this.modelo + " durante " + dias + " dias es de $" + costo);
		System.out.println("Patente del vehiculo: " + this.patente);
		System.out.println("======================================================================");
	}
	
	
}
