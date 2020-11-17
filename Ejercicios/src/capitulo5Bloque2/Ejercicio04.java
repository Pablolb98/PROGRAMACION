package capitulo5Bloque2;

import metodos.Utils;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		/**
		 * 4�.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. 
		 * Debes conseguir que se desplacen los n�meros un lugar a su derecha, de manera que el 
		 * desplazamiento sea circular, si un n�mero sale por la derecha volver� a entrar por la izquierda. 
		 * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		 */
		
		int array[]  = new int[5];
	
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			 System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int aux = array [array.length -1];
		
		for (int i = array.length -1; i>0; i--) {
			array[i] = array[i -1];
		}
		array[0] = aux;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
