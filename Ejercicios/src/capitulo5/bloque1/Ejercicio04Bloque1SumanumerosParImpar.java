package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio04Bloque1SumanumerosParImpar {

	public static void main(String[] args) {
		/*
		 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 *  Debes obtener la suma de los números pares y los impares en variables separadas
		 */
		
		int array[] = new int [150]; //Inicializamos el array
		
		int sumaPar=0, sumaImpar=0; //Creamos 2 variables llamadas sumaPar y sumaImpar
			
		for (int i = 0; i < array.length; i++) { //Recorremos el array 
			array[i] = Utils.obtenerNumeroAzar100();	
			
			if (array[i] % 2 == 0) {		//si el numero del array al dividirlo entre 2 el resto da 0, el numero es par
				sumaPar = sumaPar + array[i];
			}else {							//si el resto no da 0, el numero es impar
				sumaImpar = sumaImpar + array[i];
			}
			
		}
		System.out.println("La suma total de los numeros pares = " + sumaPar);
		System.out.println("La suma total de los numeros Impares = " + sumaImpar);

	}

}
