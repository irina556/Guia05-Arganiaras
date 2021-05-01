package main;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException() {
		super("Dia ocupado por otro trabajo");
	}
}
