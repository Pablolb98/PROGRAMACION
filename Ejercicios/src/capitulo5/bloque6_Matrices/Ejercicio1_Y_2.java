package capitulo5.bloque6_Matrices;

import metodos.Utils;

public class Ejercicio1_Y_2 {
	/**
	 * 1� - Crea un m�todo que rellena la matriz con valores creados al azar. 
	 * 		El m�todo recibir� la matriz y devolver� "void".
	 * 
	 * 2� - Crea un m�todo que imprima la matriz en consola. 
	 * 		El m�todo recibir� la matriz y devolver� "void".
	 * @param args
	 */

	public static void main(String[] args) {
		int matriz [][]  = new int[3][3];
			MatrizValoresAzar(matriz);
	}
	public static void MatrizValoresAzar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzarSinLimites();
				
				System.out.print(matriz[i][j] + " \t");
				
			}System.out.println();
		}
	}

}
