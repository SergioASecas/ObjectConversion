package test;

import EjemploConversionObjetos.Empleado;
import EjemploConversionObjetos.Escritor;
import EjemploConversionObjetos.Gerente;
import EjemploConversionObjetos.TipoEscritura;

public class Prueba {
	
	public static void main(String []args) {
		Empleado empleado = new Escritor("Mario benedetti", 205200.2, TipoEscritura.CLASICO);
		System.out.println(empleado.obtenerDetalles());
		Escritor escritor = (Escritor) empleado;
		System.out.println(escritor.getTipoEscrituraEntexto());
		
		empleado = new Gerente("Sergio", 7000000.0, "Sistemas");
		System.out.println(empleado.obtenerDetalles());
		
		Gerente gerente = (Gerente)empleado;
		System.out.println(gerente.getDepartamento());
	}

	

}
