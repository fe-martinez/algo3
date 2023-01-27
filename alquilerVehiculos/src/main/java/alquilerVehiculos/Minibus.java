package alquilerVehiculos;

public class Minibus extends Vehiculo {
	private static final int COSTO_EXTRA = 300;
	private static final int PRECIO_BASE = 1500;
	private static final int PRECIO_POR_PLAZA = 100;
	
	private int plazas; //PESO MAXIMO AUTORIZADO EN TONS.
	private String patente;
	private String modelo;
	

	public Minibus(int plazas, String patente, String modelo) {
		super(modelo, patente);
		this.plazas = plazas;
	}

	public int calcularAlquiler(int dias) {	
		return (PRECIO_BASE + (plazas * PRECIO_POR_PLAZA) * dias) + COSTO_EXTRA;
	}
	
	public void emitirPresupuesto(int dias) {
		super.emitirPresupuesto(dias);
	}
}
