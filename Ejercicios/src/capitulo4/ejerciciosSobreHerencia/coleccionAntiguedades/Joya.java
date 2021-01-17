package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedades {

	String material;
	
	public Joya() {	
	}

	public Joya(int aņoFabrica, String origen, int precio) {
		super(aņoFabrica, origen, precio);
		
	}

	public Joya(int aņoFabrica, String origen, int precio, String material) {
		super(aņoFabrica, origen, precio);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", aņoFabrica=" + aņoFabrica + ", origen=" + origen + ", precio=" + precio
				+ "]";
	}
	
}
