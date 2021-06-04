package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio04SumanumParImpar {

	public static void main(String[] args) {
		/**
		 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes obtener la suma de los números pares y los impares en variables separadas.
		 */
		int array[] = new int[10];
		
		int sumaPar = 0, sumaImpar=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100(); //Numero al azar entre 0 y 100
			System.out.println(array[i]);			 
			
			if (array[i] % 2 == 0) {		//si el valor del array al dividirlo entre 2, el resto da 0...Los numeros son pares
				sumaPar = sumaPar + array[i];	//Se suman todos los numeros pares
			}
			if (array[i] % 2 == 1) {		//si el valor del array al dividirlo entre 2, el resto da 1...Los numeros son impares
				sumaImpar = sumaImpar + array[i]; //Se suman todos los numeros impares
			}
		}
		System.out.println("La suma total de los numeros PARES son " + sumaPar);
		System.out.println("La suma total de los numeros IMPARES son " + sumaImpar);
	}

}
