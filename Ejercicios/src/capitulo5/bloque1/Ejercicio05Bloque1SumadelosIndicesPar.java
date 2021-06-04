package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio05Bloque1SumadelosIndicesPar {

	public static void main(String[] args) {
/**
 * 5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
 */
		int array [] = new int[150];
		
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			
			if (i % 2 == 0) {
				suma += array[i];
				
			}
		}System.out.println("La suma de los indices pares es " + suma);
	}

}
