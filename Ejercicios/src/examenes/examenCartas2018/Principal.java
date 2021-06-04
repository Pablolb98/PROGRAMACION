package examenes.examenCartas2018;

public class Principal {
	
	public static void main(String[] args) {
	Baraja baraja = new Baraja();
	
		baraja.crearBaraja();
//		baraja.mostrarBaraja();
		
		//baraja.pasarDeAbajoArriba();
		//baraja.mostrarBaraja();

//		baraja.pasarDeArribaAbajo();
//		baraja.mostrarBaraja();
		
//		baraja.mezclar();
//		baraja.mostrarBaraja();
		
//		baraja.ordenar();
//		baraja.mostrarBaraja();
		
		Jugador jugador1 = new Jugador("pablo");
		baraja.repartir(jugador1);
		System.out.println(jugador1.toString());
	}

}
