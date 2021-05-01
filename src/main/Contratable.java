package main;

public interface Contratable {
	public default boolean finalizado() {
		return false;
	}
}