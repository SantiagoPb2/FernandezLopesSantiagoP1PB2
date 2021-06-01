package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Fotocopiable;

public class Historia extends Libro implements Fotocopiable{

	public Historia(Integer codigo, String nombreLibro, String autor) {
		super(codigo,nombreLibro,autor);
	}

	@Override
	public String sacarFotocopia() {
		String fotocopia = "Soy un libro de historia";
		return fotocopia;
	}
	
	

}
