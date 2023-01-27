package alquilerVehiculos;

public class Fabrica {

	public static Vehiculo crear(String modelo, String patente, int plazas_carga, TipoVehiculo tipo, boolean esPremium) {
		if(tipo == TipoVehiculo.AUTO) {
			return new Auto(plazas_carga, patente, modelo, esPremium);
		} else if(tipo == TipoVehiculo.CARGA) {
			return new Carga(plazas_carga, patente, modelo);
		} else if(tipo == TipoVehiculo.MINIBUS) {
			return new Minibus(plazas_carga, patente, modelo);
		}
		return null;
	}
}
