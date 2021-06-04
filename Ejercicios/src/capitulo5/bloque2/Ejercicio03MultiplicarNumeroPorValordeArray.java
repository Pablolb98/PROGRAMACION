package capitulo5.bloque2;

import metodos.Utils;

public class Ejercicio03MultiplicarNumeroPorValordeArray {

	public static void main(String[] args) {
		/**
		 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, 
		 * pedido al usuario.
		 */
		
		int array[] = new int[30];
		System.out.println("Introduce un numero");
		int num = Utils.obtenerEnteroPorScanner();
		
		for (int i = 0; i < array.length; i ++) {
			array [i] = Utils.obtenerNumeroAzar100();
			
			array[i] = (array[i] * num);
			System.out.println("La multiplicacion de " + array[i] + " x " + num + " es: " + (array[i] * + num));
		}

	}

}
