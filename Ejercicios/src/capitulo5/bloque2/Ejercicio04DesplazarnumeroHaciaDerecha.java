package capitulo5.bloque2;

import metodos.Utils;

public class Ejercicio04DesplazarnumeroHaciaDerecha {

	public static void main(String[] args) {
		
		/**
		 * 4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. 
		 * Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el 
		 * desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda. 
		 * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		 */
		
		int array[]  = new int[] {1, 2, 3, 4, 5};
	
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "  ");
		}
		System.out.println();

		int aux = array[array.length-1];
		for (int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = aux;
		
		
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "  ");
		}
		
		
		
		
		
	}
}
