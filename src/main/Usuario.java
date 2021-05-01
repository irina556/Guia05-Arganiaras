package main;

import java.util.ArrayList;

public class Usuario {
	private ArrayList<Contratable> contratables= new ArrayList<>();

	public void contratar(Contratable contratable) throws AlquilerNoEntregadoException {
		int i=0;
		int cont=0;
		while(i<contratables.size() && cont<3) {
			if(contratables.get(i) instanceof Alquiler) {
				cont++;
			}
			i++;	
		}
		if(cont>2) {
			throw new AlquilerNoEntregadoException();
		}
		else {
			contratables.add(contratable);
		}
	}
}
