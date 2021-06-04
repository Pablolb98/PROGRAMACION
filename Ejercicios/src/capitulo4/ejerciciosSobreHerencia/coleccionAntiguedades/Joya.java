package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedades {

	String material;
	
	public Joya() {	
	}

	public Joya(int a�oFabrica, String origen, int precio) {
		super(a�oFabrica, origen, precio);
		
	}

	public Joya(int a�oFabrica, String origen, int precio, String material) {
		super(a�oFabrica, origen, precio);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", a�oFabrica=" + anoFabrica + ", origen=" + origen + ", precio=" + precio
				+ "]";
	}
	
}
