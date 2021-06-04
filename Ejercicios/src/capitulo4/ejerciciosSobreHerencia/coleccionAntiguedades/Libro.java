package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedades {

	public String autor;
	public String titulo;
	

	public Libro(int anoFabrica, String origen, int precio, String autor, String titulo) {
		super(anoFabrica, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", a�oFabrica=" + anoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}
	
}
