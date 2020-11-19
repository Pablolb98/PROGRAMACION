package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo2 {
	/**
	 * 2.- Un m�todo llamado "findAndReplace", que reciba: 
   - Un array de n�meros enteros.
   - Un valor entero que debe buscarse en el array.
   - Un valor entero que debe servir para reemplazar.
	El m�todo buscar� todas las ocasiones en las que el segundo par�metro aparezca dentro del array y reemplazar� ese valor con el valor del tercer par�metro.
	El m�todo main debe crear un array, imprimirlo en consola, llamar al m�todo "findAndReplace" y volver a imprimir el array en consola.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [5];
		findAndReplace(array);
	}
	public static int findAndReplace(int array[]) {
		int num1 = 5;
		int reemplazo = 9;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar10();
			if (num1 == array[i]) {
				array[i] = reemplazo;
			}
			System.out.println(array[i]);
		}
		return reemplazo;
	}
	
}
