package main;

import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private String correoElectronico;
	private String oficio;
	private int costoPorHora;
	private int porcentajeComision;
	private ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
	
public Trabajador(String nombre,String correoElectronico,String oficio,int costoPorHora,int porcentajrComision) {
	this.nombre=nombre;
	this.correoElectronico=correoElectronico;
	this.oficio=oficio;
	this.costoPorHora=costoPorHora;
	this.porcentajeComision=porcentajeComision;
	}
	
}
