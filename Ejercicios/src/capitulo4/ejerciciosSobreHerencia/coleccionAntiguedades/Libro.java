package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedades {

	public String autor;
	public String titulo;
	
	public Libro() {
	}

	public Libro(int a�oFabrica, String origen, int precio, String autor, String titulo) {
		super(a�oFabrica, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", a�oFabrica=" + a�oFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}
	
}
