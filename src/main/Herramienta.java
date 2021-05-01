package main;

public class Herramienta {
	private String nombre;
	private double costoPorDia;

	public Herramienta(String nombre,double costoPorDia) { //ver esta funcion, usar get
		this.nombre=nombre;
		this.costoPorDia=costoPorDia;
	}
	
	public double getCostoPorDia() {
		return costoPorDia;
	}
	public String getNombre() {
		return nombre;
	}
}
