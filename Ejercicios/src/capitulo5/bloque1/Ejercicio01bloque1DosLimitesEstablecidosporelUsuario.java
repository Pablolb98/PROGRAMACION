package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio01bloque1DosLimitesEstablecidosporelUsuario {

	public static void main(String[] args) {
		
		/*
		 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 
		 * un límite inferior y uno superior que debe especificar el usuario. Debes mostrar el array 
		 * en pantalla para comprobar el funcionamiento
		 */
		
		
		int array[] = new int [150];
		
		int limitemin, limitemax;
		
		System.out.println("Introduce un limite entre 2 numeros"); //El usuario establece un limite minimo y maximo
		limitemin = Utils.obtenerEnteroPorScanner();	//Primer numero
		limitemax = Utils.obtenerEnteroPorScanner();	//Segundo Numero
		
		for (int i = 0; i < array.length; i++) {	//Recorremos el Array
			array[i]= Utils.numAleatorioLimSupInf(limitemin, limitemax); //Array de i va a imprimir numeros 
																		//aleatorios entre el limitemin y el 
																		//limitemax (que son los numeros de arriba)
			
			System.out.println(array[i]); //Se va a mostrar en pantalla 150 numeros al azar entre el limiteMin
										 //y el limiteMax introducido por el usuario
		}
			
	}

}
