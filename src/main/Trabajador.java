package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trabajador {
	private String nombreTrabajador;
	private String correoElectronico;
	private String oficio;
	private int costoPorHora;
	private int porcentajeComision;
	private ArrayList<Servicio> servicios= new ArrayList<>();
	
	
	
public Trabajador(String nombre,String correoElectronico,String oficio,int costoPorHora,int porcentajeComision, LocalDate fechaInicio,LocalDate fechaFin) {
	this.nombreTrabajador=nombre;
	this.correoElectronico=correoElectronico;
	this.oficio=oficio;
	this.costoPorHora=costoPorHora;
	this.porcentajeComision=porcentajeComision;
	
	}
	

private void compararAgenda(LocalDate fechaNueva)throws AgendaOcupadaException {
	for(int i=0;i<servicios.size();i++){
		if(servicios.get(i).getFechaInicio().equals(fechaNueva)) {
			throw new AgendaOcupadaException();
		}
	}
}


private void compararTrabajo(Servicio servicio) throws OficioNoCoincideException, AgendaOcupadaException{
	if(!this.oficio.equals(servicio.oficio)){
		throw new OficioNoCoincideException();	
	}
}	


public void agregarTrabajo(Servicio servicio, LocalDate fechaNueva) throws OficioNoCoincideException, AgendaOcupadaException {
	compararTrabajo(servicio);
	compararAgenda(fechaNueva);
	servicios.add(servicio);	
	}
}
 
