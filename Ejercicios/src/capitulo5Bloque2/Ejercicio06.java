package capitulo5Bloque2;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 *6�.- Realiza un ejercicio igual al anterior, en el que el usuario tambi�n pueda
		 * deteminar la direcci�n del movimiento.
		 */
		int array[] = new int[5];
		int aux, cant = 0, direcc;
		String str;

		str = JOptionPane.showInputDialog("Introduce una direcci�n para desplazar el array. 1 - izquierda. 2 - derecha: ");
		direcc = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce la cantidad de posiciones que desea desplazar: ");
		cant = Integer.parseInt(str);

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.println("Array sin intercambiar: " + array[i]);
		}
		if (direcc == 1) {
			for (int i = 0; i < cant; i++) {

				
				aux = array[0];	// Guardo la primera posici�n del array
				
				for (int j = 0; j < array.length - 1; j++) {		// Recorro las posiciones del array de primera a pen�ltima
					array[j] = array[j + 1];
				}
				
				array[array.length - 1] = aux;		// La primera posici�n, guardada en aux, pasa a ser la �ltima
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(" " + array[i]);

			}
		}

		else {

			for (int i = 0; i < cant; i++) {

				
				aux = array[array.length - 1];// El �ltimo lo guardo en aux

				
				for (int j = array.length - 1; j > 0; j--) {	// desplazo todos los elementos a la derecha dejando la posici�n 0 vac�a
					array[j] = array[j - 1];
				}
				
				array[0] = aux;	// El �ltimo pasa a la posici�n 0

			}
			for (int i = 0; i < array.length; i++) {
				System.out.println("Array desplazado hacia la derecha " + cant + " veces: " + array[i]);

			}
		}
	}

}
