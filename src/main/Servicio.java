package main;

import java.time.LocalDate;

public class Servicio{
	protected String oficio;
	boolean urgente;
	protected LocalDate fechaInicio, fechaFin;
	
	
	public String getOficio() {
		return oficio;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
}
