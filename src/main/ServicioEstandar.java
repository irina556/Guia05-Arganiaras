package main;

public class ServicioEstandar extends Servicio {
	private int montoFijo;
	
	public ServicioEstandar(int monto) {
		this.montoFijo=monto;
	}
	
	public int costo (int plus) {
		int costoTotal;
		if(urgente=false) {
			costoTotal=montoFijo+plus;
		}
		else {
			costoTotal=(montoFijo+plus)+(50*(montoFijo+plus))/100;
		}
		return costoTotal;
	}
}
