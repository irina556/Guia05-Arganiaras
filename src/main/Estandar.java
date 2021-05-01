package main;

import java.time.LocalDate;

public class Estandar extends Servicio implements Contratable{
	private int montoFijo;
	private double plus;
	
	public Estandar(String oficio,int monto,double profesionalPlus, boolean urgente,LocalDate fechaInicio,LocalDate fechaFin) {
		this.montoFijo=monto;
		this.plus=profesionalPlus;
		this.urgente=urgente;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.oficio=oficio;
	}
	
	public double obtenerCosto () {
		double costoTotal;
		if(urgente==false) {
			costoTotal=montoFijo+plus;
		}
		else {
			costoTotal=(montoFijo+plus)+(50*(montoFijo+plus))/100;
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
