//package capitulo5.bloque6_matrices;
//
//import capitulo5.bloque1.Utils;
//
//public class Act07_ArrayUnidimensional {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int matriz[][] = new int[5][5];
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				matriz[i][j] = Utils.obtenerNumeroAzar10();
//				System.out.print(matriz[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		arrayUnidimensional(matriz);
//	}
//
//	public static void arrayUnidimensional(int[][] matriz) {
//
//		/*
//		 * Crea un m�todo que construya un array unidimensional con todos los elementos
//		 * de la matriz. El m�todo recibir� una matriz y devolver� un array.
//		 */
//
//		int indice = 0;
//		
//		int array[] = new int[matriz.length * matriz[0].length];
//	
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				array[indice] = matriz[i][j];
//				indice++;
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("\n" + array[i] + " ");
//		}
//
//	}
//}
