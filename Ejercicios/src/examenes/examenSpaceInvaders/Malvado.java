package examenes.examenSpaceInvaders;

import metodos.Utils;

public class Malvado{
	private int puntosVida = Utils.numAleatorioLimSupInf(50, 100);
	private String nombre = "Alien";
	private boolean vivo = true;
	private int probabilidadDisparo = Utils.numAleatorioLimSupInf(5, 25);
	
	public Malvado() {
	}
	public Malvado(int puntosVida, String nombre, boolean vivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Malvado [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}

	public int getobtienediparo() {
		return probabilidadDisparo;
	}
	public void setobtienediparo(int obtienediparo) {
		this.probabilidadDisparo = obtienediparo;
	}

	
}
