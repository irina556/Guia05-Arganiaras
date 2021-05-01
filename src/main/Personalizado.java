package main;

import java.time.LocalDate;

public class Personalizado extends Servicio implements Contratable {
	private double valorPresupuestado;
	private double costoMateriales;
	private double costoTransporte;
	
	public Personalizado(String oficio,double valorPresupuestado,double costoMateriales,double costoTransporte, boolean urgente, LocalDate fechaInicio,LocalDate fechaFin) {
		this.valorPresupuestado=valorPresupuestado;
		this.costoMateriales=costoMateriales;
		this.costoTransporte=costoTransporte;
		this.urgente=urgente;
		this.fechaFin=fechaFin;
		this.fechaInicio=fechaInicio;
		this.oficio=oficio;
	}
	
	public double obtenerCosto() {
		double costoTotal;
		if(urgente==false) {
		costoTotal=valorPresupuestado+costoMateriales+costoTransporte;
		}
		else {
			costoTotal=(valorPresupuestado+costoMateriales+costoTransporte)+(50*(valorPresupuestado+costoMateriales+costoTransporte))/100;
		}
		return costoTotal;
	
	}
	
	public boolean finalizado() {
		if(fechaFin==null) {
			return false;
		}
		else {
			return true;
		}
	}
}
