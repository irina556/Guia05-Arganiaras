package main;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws OficioNoCoincideException, AgendaOcupadaException, AlquilerNoEntregadoException {
		
		LocalDate fechaServE=LocalDate.of(2021,04,05);
		Estandar servE= new Estandar("Albañil",50,10,false,null,fechaServE); 
		Estandar servE2= new Estandar("Carpintero",50,10,true,null,null);
		Personalizado servP= new Personalizado("Albañil",50,60,70,false,LocalDate.of(2021, 04, 03),LocalDate.of(2021, 04, 03));
		Personalizado servP2= new Personalizado(null,50,60,70,true,LocalDate.of(2021, 04, 03),LocalDate.of(2021, 03, 05));
		
//Pruebas apartado 4
		
		//Estandar
		System.out.println("Primer valor costo estandar: " + servE.obtenerCosto()); //tiene que devolver 60
		System.out.println("Segundo valor costo estandar: " + servE2.obtenerCosto()); //tiene que devolver 90
		
		//Personalizados
		System.out.println("Primer valor costo personalizado: " + servP.obtenerCosto()); // tiene que devolver 180
		System.out.println("Segundo valor costo personalizado: " + servP2.obtenerCosto()); //tiene que devolver 270
		
 //Pruebas apartado 5
		
		//Alquiler1
		Herramienta h= new Herramienta("martillo",20);
		LocalDate diaInicio= LocalDate.of(2021, 04, 20);
		LocalDate diaFin= LocalDate.of(2021, 04, 25);
		LocalDate diaDev= LocalDate.of(2021, 04, 25);
		Alquiler alquiler1= new Alquiler(diaInicio,diaFin,diaDev,h);
		
		
		//Alquiler2
		LocalDate diaInicio1= LocalDate.of(2021, 04, 20);
		LocalDate diaFin1= LocalDate.of(2021, 04, 25);
		Alquiler alquiler2= new Alquiler(diaInicio1,diaFin1,null,h);
		
		
		//Alquiler3
		LocalDate diaInicio2= LocalDate.of(2021, 04, 20);
		LocalDate diaFin2= LocalDate.of(2021, 04, 25);
		LocalDate diaDev2= LocalDate.of(2021, 04, 26);
		Alquiler alquiler3= new Alquiler(diaInicio2,diaFin2,diaDev2,h);
		
		//Alquiler4
		LocalDate diaInicio3= LocalDate.of(2021, 04, 20);
		LocalDate diaFin3= LocalDate.of(2021, 04, 25);
		LocalDate diaDev3= LocalDate.of(2021, 04, 26);
		Alquiler alquiler4= new Alquiler(diaInicio2,diaFin2,diaDev2,h);
		
		System.out.println("Valor de costo: " + alquiler1.costoAlquiler());
		System.out.println("Mora: " + alquiler1.enMora());
		
		System.out.println("Valor de costo: " +alquiler2.costoAlquiler());
		System.out.println("Mora: " + alquiler2.enMora());
		
		System.out.println("Valor de costo: " +alquiler3.costoAlquiler());
		System.out.println("Mora: " + alquiler3.enMora());
		
		
//Prueba apartado 6
		System.out.println("Finalizado1: " +alquiler1.finalizado());
		System.out.println("Finalizado2: " +alquiler2.finalizado());
		System.out.println("Finalizado3: " +alquiler3.finalizado());
		System.out.println("Finalizado Servicio Estandar: " +servE.finalizado());
		System.out.println("Finalizado Servicio Personalizado: " +servP.finalizado());
		
//Prueba apartado 7a
		LocalDate fechaInicioTrab1=LocalDate.of(2021, 05, 20);
		LocalDate fechaFinTrab1=LocalDate.of(2021, 05, 21);
		LocalDate fechaTrabajo1=LocalDate.of(2021, 04, 03);
		LocalDate fechaTrabajo2=LocalDate.of(2021, 04, 03);
		Trabajador trabajador1= new Trabajador("Pablo","pablo@hotmail.com","Albañil",20,10,fechaInicioTrab1,fechaFinTrab1);
		System.out.println("Agregar trabajo: ");
		try {
			trabajador1.agregarTrabajo(servP2,fechaTrabajo1);
		}
		catch(OficioNoCoincideException e) {
			System.out.println("Oficio no coincide");
		}
		trabajador1.agregarTrabajo(servP,fechaTrabajo1);

//Prueba apartado 7b
		
		System.out.println("Agregar trabajo2: ");
		try {
		trabajador1.agregarTrabajo(servP,fechaTrabajo2);
		}
		catch(AgendaOcupadaException e) {
			System.out.println("Agenda ocupada");
		}
		
//Prueba apartado 8
		Usuario u= new Usuario();
		u.contratar(alquiler1);
		u.contratar(alquiler3);
		u.contratar(alquiler2);
		System.out.println("---Separador---");
		try {
			u.contratar(alquiler1);
		}
		catch(AlquilerNoEntregadoException c) {
			System.out.println("Hay más de dos alquileres sin devolver");
		}
		
	}

}
