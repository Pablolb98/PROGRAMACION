package capitulo5.bloque2;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio05UsuarioIndicaCantidadDesplazamientos {

	public static void main(String[] args) {
		/*
		 *4º.- Realiza un ejercicio igual al anterior, pero en el que el usuario pueda
		 * indicar la cantidad de posiciones que deseamos desplazar.
		 */

		int array[] = new int[5];
		int i, aux, cantidad;
		String srt;

		for (i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.print(" " + array[i]);
		}

		srt = JOptionPane.showInputDialog("Introduce la cantidad de posiciones que desea desplazar: ");
		cantidad = Integer.parseInt(srt);

		for (int vueltas = 1; vueltas <= cantidad; vueltas++) {

			aux = array[array.length - 1];    // El último lo guardo en aux

			
			for (i = array.length - 1; i > 0; i--) {	// desplazo todos los elementos a la derecha dejando la posición 0 vacía
				array[i] = array[i - 1];
			}
			
			array[0] = aux;		// El último pasa a la posición 0

		}
		System.out.println();
		for (i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);

		}
	}
}
