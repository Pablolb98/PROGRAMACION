package examenes.TresEnRaya;

import javax.swing.JOptionPane;

public class TresEnRayaConArrays {
	static int filaSup[] = new int[3];
	static int filaMed[] = new int[3];
	static int filaInf[] = new int[3];
	static int posicion;
	static int posicion2;
	public static void main(String[] args) {
		
		int opcionMenu;
		
		for (int i = 0; i < filaSup.length; i++) {
			filaSup[i] = 0;
			
		}
		
		for (int i = 0; i < filaMed.length; i++) {
			filaMed[i] = 0;
		}
		
		for (int i = 0; i < filaInf.length; i++) {
			filaInf[i] = 0;
		}
		


		do {
			System.out.println(filaSup[0] + " " + filaSup[1] + " " + filaSup[2] + "\n" + filaMed[0] + " " + filaMed[1] + " "
					+ filaMed[2] + "\n" + filaInf[0] + " " + filaInf[1] + " " + filaInf[2] + "\n");
			opcionMenu = menu();
			switch(opcionMenu) {
			case 0:
				System.out.println("adios");
				System.exit(0);
				break;
				
			case 1: 
				Jugador1(posicion);
				
				break;
			case 2: 
				Jugador2(posicion2);
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcionMenu != 0);
	}

	public static int menu() {
		String strmenu = "\nMenu" + "\n0- Para dejar de Jugar" + "\n1- Jugador1 Introduce ficha" + "\n2- Jugador2 Introduce ficha";
		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));
		return opcionMenu;
	}
	
	public static int Jugador1(int jugador1) {
		
		posicion = Integer.parseInt(JOptionPane.showInputDialog("En que fila desea introducir la ficha?"));
		while(posicion == posicion2) {
			if (posicion == posicion2) {
				posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion ocupada por el jugador 2, vuelva a repetir"));
			}
		}
		if (posicion == 1) {
			filaSup[0] = 1;
		}
		if (posicion == 2) {
			filaSup[1] = 1;
		}
		if (posicion == 3) {
			filaSup[2] = 1;
		}
		if (posicion == 4) {
			filaMed[0] = 1;
		}
		if (posicion == 5) {
			filaMed[1] = 1;
		}
		if (posicion == 6) {
			filaMed[2] = 1;
		}
		if (posicion == 7) {
			filaInf[0] = 1;
		}
		if (posicion == 7) {
			filaInf[1] = 1;
		}
		if (posicion == 8) {
			filaInf[2] = 1;
		}
		return posicion;
		
	}
	public static int Jugador2(int jugador2) {
		
		posicion2 = Integer.parseInt(JOptionPane.showInputDialog("En que fila desea introducir la ficha?"));

		while(posicion2 == posicion) {
			if (posicion2 == posicion) {
				posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Posicion ocupada por el jugador 1, vuelva a repetir"));
			}
		}
		
		
		if (posicion2 == 1) {
			filaSup[0] = 2;
		}
		if (posicion2 == 2) {
			filaSup[1] = 2;
		}
		if (posicion2 == 3) {
			filaSup[2] = 2;
		}
		if (posicion2 == 4) {
			filaMed[0] = 2;
		}
		if (posicion2 == 5) {
			filaMed[1] = 2;
		}
		if (posicion2 == 6) {
			filaMed[2] = 2;
		}
		if (posicion2 == 7) {
			filaInf[0] = 2;
		}
		if (posicion2 == 7) {
			filaInf[1] = 2;
		}
		if (posicion2 == 8) {
			filaInf[2] = 2;
		}
		return posicion2;
		
	}
}
