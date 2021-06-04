package capitulo5.bloque2;

import metodos.Utils;

public class Ejercicio02ParImpardeUnArrayLLevarloAOtros {

	public static void main(String[] args) {
		
		/**
		 * 2º.- Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar 
		 * del tercer array debes copiar los elementos de índice impar del primer array; en los elementos de índice
		 *  par del tercer array debes copiar los elementos de índice par del segundo array.
		 */
		int array[] = new int [150];
		int array2[] = new int [150];
		int array3[] = new int [150];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			
		}
		for (int i = 0; i < array2.length; i ++) {
			array2[i] = Utils.obtenerNumeroAzar100();
		}
		
		for (int i = 0; i < array3.length; i += 2) {
			array3[i] = array[i];
			System.out.println(array3[i]);
		}
		for (int i = 1; i < array3.length; i += 2) {
			array3[i]= array2[i];
			System.out.println(array3[i]);
			
		}
	}

}
