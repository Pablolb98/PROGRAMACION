package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Jarron extends Antiguedades {

	String material;
	String color;
	
	public Jarron() {
	}

	public Jarron(int añoFabrica, String origen, int precio) {
		super(añoFabrica, origen, precio);
	}

	public Jarron(int añoFabrica, String origen, int precio, String material, String color) {
		super(añoFabrica, origen, precio);
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Jarron [material=" + material + ", color=" + color + ", añoFabrica=" + anoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	
}
