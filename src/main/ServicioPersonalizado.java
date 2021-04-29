package main;

public class ServicioPersonalizado extends Servicio {

	private int montoFijo;
	public ServicioPersonalizado(int monto) {
		this.montoFijo=monto;
	}
	
	public int costo(int valorPresupuestado,int costoMateriales,int costoTransporte) {
		int costoTotal;
		if(urgente=false) {
		costoTotal=valorPresupuestado+costoMateriales+costoTransporte;
		}
		else {
			costoTotal=(valorPresupuestado+costoMateriales+costoTransporte)+(50*(valorPresupuestado+costoMateriales+costoTransporte))/100;
		}
		return costoTotal;
	
	}
}
