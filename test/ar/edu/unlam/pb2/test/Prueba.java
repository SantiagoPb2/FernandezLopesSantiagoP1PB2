package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Biblioteca;
import ar.edu.unlam.pb2.Estudiante;
import ar.edu.unlam.pb2.Geografia;
import ar.edu.unlam.pb2.Historia;
import ar.edu.unlam.pb2.Libro;
import ar.edu.unlam.pb2.Matematica;
import ar.edu.unlam.pb2.interfaces.Fotocopiable;

public class Prueba {

	@Test
	public void queSePuedaCrearUnLibro() {
		Libro libro = new Historia(12,"NombreLibro","Santiago");
		Libro libro1 = new Geografia(11,"Nombre","Santiago");
		Libro libro2 = new Matematica(9,"Calculo","Santiago");
		
		assertEquals(12,libro.getCodigo(),0);
		assertEquals(11,libro1.getCodigo(),0);
		assertEquals(9,libro2.getCodigo(),0);
	}
	
	@Test
	public void queSePuedaCrearUnEstudiante() {
		Estudiante estudiante = new Estudiante(41399474,"Fernandez","Santiago");
		
		assertNotNull(estudiante);
	}
	
	@Test
	public void queSePuedaSacarFotocopiaDeLosLibrosDeGeografiaHistoria() {
		Fotocopiable historia = new Historia(12,"NombreLibro","Santiago");
		Fotocopiable geografia = new Geografia(11,"Nombre","Santiago");
		
		assertEquals("Soy un libro de historia",historia.sacarFotocopia());
		assertEquals("Soy un libro de geografia",geografia.sacarFotocopia());
	}
	
	@Test
	public void queSePuedaPrestarUnLibroaUnEstudiante(){
		Libro libro = new Historia(12,"NombreLibro","Santiago");
		Libro libro1 = new Geografia(11,"Nombre","Santiago");
		Estudiante estudiante = new Estudiante(41399474,"Fernandez","Santiago");
		Biblioteca biblioteca = new Biblioteca("Azteca");
		biblioteca.agregarLibro(libro);
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarEstudiante(estudiante);
		
		assertTrue(biblioteca.prestarLibro(12,41399474));
		
	}
	
	@Test
	public void queNoSePuedaPrestarUnLibroaUnEstudianteConMasDeDosLibros() {
		Libro libro = new Historia(12,"NombreLibro","Santiago");
		Libro libro1 = new Geografia(11,"Nombre","Santiago");
		Libro libro2 = new Matematica(9,"Nombre","Santiago");		
		Estudiante estudiante = new Estudiante(41399474,"Fernandez","Santiago");
		Biblioteca biblioteca = new Biblioteca("Azteca");
		biblioteca.agregarLibro(libro);
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarEstudiante(estudiante);
		biblioteca.prestarLibro(11,41399474);
		biblioteca.prestarLibro(12,41399474);

		
		assertFalse(biblioteca.prestarLibro(9,41399474));
			
	}
	
	@Test
	public void queElIndicadorDePrestamosSeaCorrecto() {
		Libro libro = new Historia(12,"NombreLibro","Santiago");
		Libro libro1 = new Geografia(11,"Nombre","Santiago");
		Libro libro2 = new Matematica(9,"Nombre","Santiago");		
		Estudiante estudiante = new Estudiante(41399474,"Fernandez","Santiago");
		Biblioteca biblioteca = new Biblioteca("Azteca");
		biblioteca.agregarLibro(libro);
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarEstudiante(estudiante);
		biblioteca.prestarLibro(11,41399474);
		biblioteca.prestarLibro(12,41399474);
		biblioteca.prestarLibro(9,41399474);
		
		assertEquals(3,biblioteca.getPrestamosRealizados(),0);
		
	}
	
	
	
	
	

}
