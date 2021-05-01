package main;

public class OficioNoCoincideException extends Exception {
public OficioNoCoincideException() {
	super("La tarea no tiene el mismo oficio que el trabajador");
	}
}
