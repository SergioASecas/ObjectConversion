package EjemploConversionObjetos;

public class Escritor extends Empleado {
	
	final TipoEscritura tipoEscritura;

	public Escritor(String nombre, Double sueldo, TipoEscritura tipoEscritura) {
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	}
	
	public String obtenerDetalles() {
		return super.obtenerDetalles() + "tipoEscritura :"+tipoEscritura.getDescripcion();
	}
	
	public TipoEscritura getTipoEscritura() {
		return this.tipoEscritura;
	}
	
	public String getTipoEscrituraEntexto() {
		return tipoEscritura.getDescripcion();
	}

}
