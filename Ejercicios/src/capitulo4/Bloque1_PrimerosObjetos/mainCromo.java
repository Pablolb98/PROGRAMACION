package capitulo4.Bloque1_PrimerosObjetos;

import java.util.ArrayList;
import java.util.List;

public class mainCromo {

	public static void main(String[] args) {
		CromoBaloncesto jugador1 = new CromoBaloncesto("Paco", 180, 90, 20);
		CromoBaloncesto jugador2 = new CromoBaloncesto("Juan", 185, 82, 15);
		CromoBaloncesto jugador3 = new CromoBaloncesto("Pablo", 190, 85, 16);
		CromoBaloncesto jugador4 = new CromoBaloncesto("Fernando", 192, 85, 20);
		CromoBaloncesto jugador5 = new CromoBaloncesto("Marcos", 182, 89, 10);
		
		
		List<CromoBaloncesto> lista = new ArrayList<CromoBaloncesto>();
		
		lista.add(jugador1);
		lista.add(jugador2);
		lista.add(jugador3);
		lista.add(jugador4);
		lista.add(jugador5);
		
		for (int i=0; i<lista.size(); i++) {
			System.out.println(jugador1.toString());
			System.out.println(jugador2.toString());
			System.out.println(jugador3.toString());
			System.out.println(jugador4.toString());
			System.out.println(jugador5.toString());
		}
		ordenaJugadores(lista);
		
	}
	
		public static void ordenaJugadores (List<CromoBaloncesto> lista) {
					
	}
}
