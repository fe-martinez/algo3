package alquilerVehiculos;

public class Auto extends Vehiculo {
	private static final int COSTO_PREMIUM = 150;
	private static final int COSTO_NORMAL = 100;
	private static final int PRECIO_BASE = 500;
	
	private int plazas;
	private String patente;
	private String modelo;
	private boolean esPremium;
	
	public Auto(int plazas, String patente, String modelo, boolean esPremium) {
		super(modelo,patente);
		this.plazas = plazas;
		this.esPremium = esPremium;
	}

	public int calcularAlquiler(int dias) {
		if(esPremium) {
			return (PRECIO_BASE + (plazas * COSTO_PREMIUM)) * dias;
		}
		
		return (PRECIO_BASE + (plazas * COSTO_NORMAL)) * dias;
	}
	
	public void emitirPresupuesto(int dias) {
		super.emitirPresupuesto(dias);
	}
	
}
