package EjemploConversionObjetos;

public class Empleado {
	private String nombre;
	private Double sueldo;

	public Empleado(String nombre, Double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String obtenerDetalles() {
		return "Nombre :"+this.nombre+" Sueldo :"+this.sueldo;
	}

}
