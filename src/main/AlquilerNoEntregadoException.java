package main;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("El usuario posee dos alquileres sin devolver");
	}

}
