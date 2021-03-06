package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private List<Libro> libros;
	private List<Estudiante> estudiantes;
	private List<Libro> librosPrestados;
	private String nombre;
	private Integer prestamosRealizados;
	private Integer codigoPrestamo;
	private Integer iterador = 0;
	private Integer contador = 0;
	private Boolean disponibilidad;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros = new LinkedList<Libro>();
		this.estudiantes = new LinkedList<Estudiante>();
		this.librosPrestados = new LinkedList<Libro>();
		this.prestamosRealizados = 0;
	}
	
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public Boolean getDisponibilidad(Integer codigo) {
		for(Libro libros: libros) {
			if(libros.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
		
	}
	
	public Boolean prestarLibro(Integer codigo, Integer dni) {
		for(Libro busqueda: libros) {
			if(busqueda.getCodigo().equals(codigo)) {
				for(Estudiante busqueda2: estudiantes) {
					if(busqueda2.getDni().equals(dni) && busqueda2.getLibrosEnPosesion() <= 2) {
						this.librosPrestados.add(busqueda);
						this.libros.remove(busqueda);
						this.prestamosRealizados++;
						iterador++;
						busqueda2.setLibrosEnPosesion(iterador);
						return true;
					}
				}
			}
		}
		return false;
		
	}

	public void agregarEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
		
	}

	public Integer getPrestamosRealizados() {
		return prestamosRealizados;
	}

	public List<Libro> getLibros() {
		return libros;
	}
	
	

}
