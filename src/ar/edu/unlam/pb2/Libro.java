package ar.edu.unlam.pb2;

public class Libro {

	private Integer codigo;
	private String nombreLibro;
	private String autor;

	public Libro(Integer codigo, String nombreLibro, String autor) {
		this.codigo = codigo;
		this.nombreLibro = nombreLibro;
		this.autor = autor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
