package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio02bloque1ImprimirArrayInverso {

	public static void main(String[] args) {
		
		/*
		 *2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 *Después de su inicialización debéis imprimir el array en orden inverso. 
		 */
		
		int array[] = new int[5];
		
		System.out.println("Introduzca 5 numeros ");
		for (int i = 0; i < array.length; i++) {
			array[i]= Utils.obtenerEnteroPorScanner(); //Se le van a asignar unos numeros a array[i]
			
		}
		System.out.println("Los numeros a la inversa son ");
		
		int j = 4;
		while(j>=0) { //hasta que j sea mayor o igual a 0 se va a ejecutar el bucle
			System.out.println(array[j]); //Una vez introducidos los 5 numeros se mostraran a la inversa
			j--;
		}
	}

}
