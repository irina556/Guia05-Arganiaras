package main;
import java.time.Duration;
import java.time.LocalDate;

public class Alquiler implements Contratable{
	Herramienta h;
	LocalDate fechaInicio, fechaFin, fechaDevolucion;
	
	public Alquiler(LocalDate fechaInicio, LocalDate fechaFin,LocalDate fechaDevolucion, Herramienta h) {
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.fechaDevolucion=fechaDevolucion;
		this.h=h;
	}
	
	public double costoAlquiler() {
		double costoAlquiler;
		long cantDias;
		if(fechaDevolucion==null){ //si la herramienta no fue devuelta
			LocalDate hoy= LocalDate.now();
			cantDias= Duration.between(fechaInicio.atStartOfDay(),hoy.atStartOfDay()).toDays(); // la cantidad de dias se calcula desde la fechaInicio hasta la fecha actual
			costoAlquiler= cantDias*h.getCostoPorDia();
		}
		else {
		cantDias= Duration.between(fechaInicio.atStartOfDay(),fechaDevolucion.atStartOfDay()).toDays();
		costoAlquiler=cantDias*h.getCostoPorDia();
		}
		
		return costoAlquiler;
	}

	public boolean finalizado() {
		if(fechaDevolucion!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean enMora() {
		LocalDate hoy= LocalDate.now();
		if((fechaDevolucion==null && hoy.isAfter(fechaFin)) || (fechaDevolucion!=null && fechaDevolucion.isAfter(fechaFin))) {
			return true;	
		}
		else {
			return false;
		}
	}
}
