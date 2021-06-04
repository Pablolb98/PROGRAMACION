package capitulo4.Bloque1_PrimerosObjetos;

public class CromoBaloncesto {
		private String nombreJugador;
		private int alturaCm, pesoKg;
		private float puntosMediosPorpartido;
		
		
	public CromoBaloncesto() {
		
	}
	public CromoBaloncesto(String nombreJugador, int alturaCm, int pesoKg, float puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	public String toString() {
		return "nombreJugador " + nombreJugador 
				+ " alturaCm " + alturaCm 
				+ " pesoKg " + pesoKg 
				+ "puntosMediosPorpartido " + puntosMediosPorpartido;
	}
	
	public String getnombreJugador() {
		return nombreJugador;	
	}
	
	public void setnombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	public int getalturaCm() {
		return alturaCm;
	}
	
	public void setalturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	public int getpesoKg() {
		return pesoKg;
	}
	
	public void setpesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public float getpuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}
	
	public void setpuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
}
