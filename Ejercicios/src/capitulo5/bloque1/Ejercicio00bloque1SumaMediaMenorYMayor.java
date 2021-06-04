package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio00bloque1SumaMediaMenorYMayor {
/**
 * 0º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos 
 * los números que aparecen en el array.
 * @param args
 */
	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100(); 
			System.out.print(array[i] + "  "); 
		}
		//suma
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		System.out.println("\nsuma = " + suma);
		
		//media
				float media;
				media = (float)suma / array.length;
				System.out.println("Media = " + media);
						
		//menor y mayor
		
			int menor = 0, mayor = 0;
		
			boolean primeravez = true;
		for (int i= 0; i < array.length; i++) {
			
			if (primeravez == true) {
				mayor = array[i];
				menor = array[i];
				primeravez = false;
			}
			
			if (array[i] < menor) {
				menor = array[i];
			}
			
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		System.out.println("El menor es " + menor + " y el mayor es " + mayor);
						
						
						
						
						
						
	}
		
}
