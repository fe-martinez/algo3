package alquilerVehiculos;

public class Carga extends Vehiculo{
	private static final int COSTO_POR_TON = 300;
	private static final int PRECIO_BASE = 500;
	
	private int pma; //PESO MAXIMO AUTORIZADO EN TONS.
	private String patente;
	private String modelo;
	
	public Carga(int pma, String patente, String modelo) {
		super(modelo,patente);
		this.pma = pma;
	}

	public int calcularAlquiler(int dias) {
		return (PRECIO_BASE + (pma*COSTO_POR_TON)) * dias;
	}
	
	public void emitirPresupuesto(int dias) {
		super.emitirPresupuesto(dias);
	}
}
