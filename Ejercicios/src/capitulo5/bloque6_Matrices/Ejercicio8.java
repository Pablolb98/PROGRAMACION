package capitulo5.bloque6_Matrices;

import metodos.Utils;

public class Ejercicio8 {
		
		public static void main(String[] args) {

			/**
			 * 8� - Crea un m�todo que compruebe si la matriz es sim�trica. 
			 * (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales). 
			 * El m�todo recibir� una matriz y devolver� un boolean.
			 */
			int matriz[][] = new int[3][3];

			for (int i = 0; i < matriz[i].length; i++) {
				for (int j = 0; j < matriz[j].length; j++) {
					matriz[i][j] = Utils.obtenerNumeroAzarSinLimites(); 
					System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("La triangular de la matriz es superior = " + matrizSimetrica(matriz));
	}
			public static boolean matrizSimetrica(int matriz[][]) {
				boolean simetrica = true;
				for (int i = 0; i < matriz[i].length; i++) {
					for (int j = 0; j < matriz[j].length; j++) {
						if (matriz[i] != matriz[j]) {
							simetrica = false;
						}
					}
				}
				return simetrica;
			}
}
