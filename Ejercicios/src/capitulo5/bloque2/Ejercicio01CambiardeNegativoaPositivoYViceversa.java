package capitulo5.bloque2;

import metodos.Utils;

public class Ejercicio01CambiardeNegativoaPositivoYViceversa {

	public static void main(String[] args) {
		
		/*
		 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100.
		 *  Debes conseguir que todos los números pares del array cambien de signo, 
		 *  los positivos deben pasar a negativos y viceversa.
		 */
		
		int array[] = new int [20];
		
		int numPos = 100, numNeg = -100, numPar;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.numAleatorioLimSupInf(numNeg, numPos);
			
			if (array[i] % 2 == 0) {
				numPar = array[i];
			}
			if (array[i] > 0 ) {
				numPos = array[i];
				System.out.println("Los numeros negativos ahora son positivos " + array[i]);
			}
			else if (array[i] < 0) {
				numNeg = array[i];
				System.out.println("Los numeros positivos ahora son negativos " + array[i]);
			}
		}

	}

}
