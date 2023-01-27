package alquilerVehiculos;

import java.util.HashMap;

public class Agencia {
	HashMap<String, Vehiculo> autos;

	public Agencia(HashMap<String, Vehiculo> autos) {
		this.autos = autos;
	}
	
	public void agregarAutos(String modelo, String patente, TipoVehiculo tipo, int plazas_carga, boolean esPremium) {
		if(autos.containsKey(patente)) {
			return;
		}
		
		Vehiculo nuevo = Fabrica.crear(modelo, patente, plazas_carga, tipo, esPremium);
		autos.put(patente, nuevo);
	}
	
	public void nuevoPresupuesto(String patente, int dias) {
		Vehiculo buscado = autos.get(patente);
		buscado.emitirPresupuesto(dias);
	}
}
