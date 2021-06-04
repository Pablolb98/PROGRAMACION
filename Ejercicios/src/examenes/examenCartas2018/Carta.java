package examenes.examenCartas2018;

public class Carta {
	private int carta;
	private String nombrePalo;
	private int id;

	public Carta(int carta, String nombrePalo, int id) {
		super();
		this.carta = carta;
		this.nombrePalo = nombrePalo;
		this.id = id;
	}

	public int getCarta() {
		return carta;
	}

	public void setCarta(int carta) {
		this.carta = carta;
	}

	public String getNombrePalo() {
		return nombrePalo;
	}

	public void setNombrePalo(String nombrePalo) {
		this.nombrePalo = nombrePalo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carta [carta=" + carta + ", nombrePalo=" + nombrePalo + ", id=" + id + "]";
	}

}
