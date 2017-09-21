
public class Estudiante {

	private String nombre;
	private String apellido;
	private int edad;
	private float promedio;

	public Estudiante(String nombre, String apellido, int edad, float promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", promedio=" + promedio
				+ "]";
	}

}
