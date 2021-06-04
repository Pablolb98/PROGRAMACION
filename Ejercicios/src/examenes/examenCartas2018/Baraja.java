package examenes.examenCartas2018;

import metodos.Utils;

public class Baraja {

	Carta cartas[] = new Carta[52];
	Jugador jugadores[] = new Jugador[5];

	
	public void crearBaraja() {
		int contador = 0;
		
		for (int i = 0; i < 13; i++) {
			cartas[i] = new Carta (i, "Picas", contador);
			contador++;
		}
		
		for (int i = 13; i < 26; i++) {
			cartas[i] = new Carta (i, "Diamantes", contador);
			contador++;
		}
		
		for (int i = 26; i < 39; i++) {
			cartas[i] = new Carta (i, "Treboles", contador);
			contador++;
		}
	
		for (int i = 39; i < 52; i++) {
			cartas[i] = new Carta (i, "Corazones", contador);
			contador++;
		}
		
	}

	public void mostrarBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
		
	}
	
	public void pasarDeAbajoArriba() { 
		Carta aux = cartas[cartas.length-1];
		for (int i = cartas.length-1; i > 0; i--) {
			cartas[i] = cartas[i-1];
		}
		cartas[0] = aux;
	}
	
	public void pasarDeArribaAbajo() {
		Carta aux = cartas[0];
		
		for (int i = 1; i < cartas.length; i++) {
			cartas[i -1] = cartas[i];
		}
		  cartas[cartas.length-1]= aux;
	}
	
	public void mezclar() {
		for (int i = 0; i< cartas.length; i++) {
			int num1 = Utils.numAleatorioLimSupInf(0, 51);
			int num2 = Utils.numAleatorioLimSupInf(0, 51);
			
			Carta aux = cartas[num1];
			cartas[num1] = cartas[num2];
			cartas[num2] = aux;
		}
	}
	
	public void ordenar() {
		for (int i = cartas.length-1; i > 0 ; i--) {
			
			for (int j = 0; j < i; j++) {
				if (cartas[j].getId()> cartas[j+1].getId()) {
					
					Carta aux = cartas[j];
					cartas[j] = cartas[j+1];
					
					cartas[j+1] = aux;
				}
			}
		}
	}
	
	public void repartir(Jugador jugador1) {
		int contador = 0;
		Carta mano[] = new Carta[5];
		for (int i = cartas.length-1; i > cartas.length-5; i--) {
			mano[contador] = this.cartas[i]; 
			contador++;
		}
		jugador1.setMano(mano);
		
	}
}
