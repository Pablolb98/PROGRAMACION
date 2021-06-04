package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Jarron extends Antiguedades {

	String material;
	String color;
	
	public Jarron() {
	}

	public Jarron(int a�oFabrica, String origen, int precio) {
		super(a�oFabrica, origen, precio);
	}

	public Jarron(int a�oFabrica, String origen, int precio, String material, String color) {
		super(a�oFabrica, origen, precio);
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Jarron [material=" + material + ", color=" + color + ", a�oFabrica=" + anoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	
}
