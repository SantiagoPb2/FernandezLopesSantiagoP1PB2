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
	
	public Boolean prestarLibro(Integer codigo, Integer dni) {
		Integer iterador = 0;
		for(Libro busqueda: libros) {
			if(busqueda.getCodigo().equals(codigo)) {
				for(Estudiante busqueda2: estudiantes) {
					if(busqueda2.getDni().equals(dni) && busqueda2.getLibrosEnPosesion() <= 2) {
						this.librosPrestados.add(busqueda);
						this.libros.remove(busqueda);
						this.prestamosRealizados++;
						busqueda2.setLibrosEnPosesion(iterador++);
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

}
