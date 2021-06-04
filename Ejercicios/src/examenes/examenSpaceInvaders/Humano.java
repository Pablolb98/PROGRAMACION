package examenes.examenSpaceInvaders;

import metodos.Utils;

public class Humano{
	private int puntosVida = Utils.numAleatorioLimSupInf(50, 100);
	private String nombre = "Humano";
	private boolean vivo = true;
	private int dipara = Utils.numAleatorioLimSupInf(5, 25);
	
	public Humano() {
	}
	public Humano(int puntosVida, String nombre, boolean vivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
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
	public int getDipara() {
		return dipara;
	}
	public void setDipara(int dipara) {
		this.dipara = dipara;
	}
	
	



	
}
