package bloque05_Metodos_y_Arrays;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Metodo1ImprimirArrayConString {
	/**
	 * 1.- Un m�todo llamado "stringFromArray", que reciba un array de n�meros enteros y devuelva una cadena de caracteres.
	 *  El m�todo debe recorrer el array, de la misma forma en la que har�as para mostrarlo en consola, 
	 *  pero en lugar de imprimir en consola debes construir un objeto String. Finalmente debes devolver el String e 
	 *  imprimirlo en el m�todo "main".
	 * @param args
	 */

	public static void main(String[] args) {
		
		int array[] = new int[5];
		stringFromArray(array);
		
	}
		
	public static String stringFromArray (int array[]) {

		String str = " ";
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.print(array[i] + "  ");
			
		}
		return str;
		
	}

}
