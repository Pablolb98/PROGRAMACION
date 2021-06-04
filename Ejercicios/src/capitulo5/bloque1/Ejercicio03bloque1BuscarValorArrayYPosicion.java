package capitulo5.bloque1;

import metodos.Utils;

public class Ejercicio03bloque1BuscarValorArrayYPosicion {

	public static void main(String[] args) {
		
		/*
		 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * A continuación pedirás al usuario un valor y buscarás dicho valor en el array. 
		 * Si lo encuentras, debes indicar al usuario la posición del array en que se encuenta. 
		 * En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.
		 */
		
		int array[] = new int[150];
		int num1;
		boolean primeravez = true;
		System.out.println("Introduce un numero para buscarlo dentro del array");
		num1=Utils.obtenerEnteroPorScanner();
		for(int i= 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			if (primeravez == true) {
				num1 = array[i];
				primeravez = false;
			}
			
			if (num1 == array[i]) {
				System.out.println("El numero se encuentra en la posicion " + array[i]);
			}else{
				System.out.println("El numero no se encuentra en el array");
			}
		}
	}

}
