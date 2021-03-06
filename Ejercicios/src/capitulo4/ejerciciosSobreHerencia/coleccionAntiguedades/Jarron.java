package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Jarron extends Antiguedades {

	String material;
	String color;
	
	public Jarron() {
	}

	public Jarron(int aņoFabrica, String origen, int precio) {
		super(aņoFabrica, origen, precio);
	}

	public Jarron(int aņoFabrica, String origen, int precio, String material, String color) {
		super(aņoFabrica, origen, precio);
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Jarron [material=" + material + ", color=" + color + ", aņoFabrica=" + anoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	
}
