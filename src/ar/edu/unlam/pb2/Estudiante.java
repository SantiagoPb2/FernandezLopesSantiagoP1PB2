package ar.edu.unlam.pb2;

public class Estudiante {
	
	private Integer dni;
	private String apellido;
	private String nombre;
	private Integer librosEnPosesion;

	public Estudiante(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.librosEnPosesion = 0;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLibrosEnPosesion() {
		return librosEnPosesion;
	}

	public void setLibrosEnPosesion(Integer librosEnPosesion) {
		this.librosEnPosesion = librosEnPosesion;
	}
	
	
	

}
