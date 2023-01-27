package alquilerVehiculos;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Agencia agencia = new Agencia(new HashMap<String, Vehiculo>());
		agencia.agregarAutos("Toyota Etios", "AA444TT", TipoVehiculo.AUTO, 5, false);
		agencia.agregarAutos("Mercedes Sprinter", "OVB654", TipoVehiculo.MINIBUS, 15, false);
		agencia.agregarAutos("Scania 1444", "KJK667", TipoVehiculo.CARGA, 8, false);
		agencia.nuevoPresupuesto("AA444TT", 3);
		agencia.nuevoPresupuesto("OVB654", 3);
		agencia.nuevoPresupuesto("KJK667", 3);
	}
	
}
