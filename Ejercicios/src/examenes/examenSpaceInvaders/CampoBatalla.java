package examenes.examenSpaceInvaders;

import metodos.Utils;

public class CampoBatalla {
	String nombre;
	Malvado malvados[] = new Malvado[20];
	Humano humanos[] = new Humano[20];

	public CampoBatalla() {
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado();
			System.out.println(malvados[i]);
		}

		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano();
			System.out.println(humanos[i]);
		}
		malvados[malvados.length - 1].setPuntosVida(malvados[malvados.length - 1].getPuntosVida() * 2);
		humanos[humanos.length - 1].setPuntosVida(humanos[humanos.length - 1].getPuntosVida() * 2);

	}
	
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado(i, "Alien ", false);
		}
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano(i, "Humano " + i, false);
		}
	}
	public void mezclarMalvados_Y_Humanos() {
		for (int i = 0; i < malvados.length; i++) {
			int num1 = Utils.numAleatorioLimSupInf(0, 19);
			Malvado aux = malvados[num1];
		}
		for (int i = 0; i < humanos.length; i++) {
			int num1 = Utils.numAleatorioLimSupInf(0, 19);
			Humano aux = humanos[num1];
		}
	}
	public void dispara() {
		
		for (int i = 0; i < humanos.length; i++) {
			humanos[0].setDipara(0);
		}
		for (int i = 0; i < malvados.length; i++) {
			malvados[0].getobtienediparo();
		}
	}
	public void obtieneDisparo() {
		for (int i = 0; i < malvados.length; i++) {
			malvados[0].getobtienediparo();
		}
	}

}
