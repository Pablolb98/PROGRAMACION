package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedades {

	String material;
	
	public Joya() {	
	}

	public Joya(int añoFabrica, String origen, int precio) {
		super(añoFabrica, origen, precio);
		
	}

	public Joya(int añoFabrica, String origen, int precio, String material) {
		super(añoFabrica, origen, precio);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", añoFabrica=" + anoFabrica + ", origen=" + origen + ", precio=" + precio
				+ "]";
	}
	
}
