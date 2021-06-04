package capitulo5.bloque4;

import javax.swing.JOptionPane;
public class Capitulo5Bloque4Metodos {

	public static void main(String[] args) {
		//float media = media(6, 52, 20, 20.5f);
		//System.out.println("La media es " + media);
		
		//System.out.println("Introduce un numero");
		//int numero = obtenerNumeroDeUsuarioEntreMinimoYMaximo (0, 30);
		//System.out.println("El numero es " + numero);
		
		//System.out.println("El mayor de 2 numeros");
		//System.out.println(maximo(0, 10000));
		
		//System.out.println("Numero Impar entre limites");
		//int numero =numeroImparEntreLimites(0, 200);
		
		//System.out.println("Introduce un numero entre el 1 y el 10 ");
		//String str = JOptionPane.showInputDialog("Introduce un numero;");
		//int num = Integer.parseInt(str);
		//getStringFromEntero(num);
		
		//imprimeMinimoAMaximo(45, 12, 93);
		
		//	int fibo[] = fibonacci(0);
		//	for (int i = 0; fibo.length; i++) {
		//	System.out.println(fibo[i] + "");
		
		int array[] = new int[5];
		imprimeArray(array);
		
		//System.out.println(factorial(1));
		}
	/**
	 * 1º.- Método que reciba como parámetros de entrada tres valores enteros y uno flotante. 
	 * El método se llamará "media" y debe devolver la media aritmética de los cuatro valores. 
	 * El valor devuelto debe ser flotante. El método "main" debe llamar a este otro método, 
	 * con valores inventados por ti, e imprimir el valor de la media en la consola de salida.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 * @return
	 */
	public static float media(int num1, int num2, int num3, float num4) {
		float resultado = (num1 + num2 + num3 + num4) / num4;
		return resultado;
		
	}
	
	 /** 2º.- Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros: 
	 * un valor mínimo y un valor máximo. El método debe pedir un numero al usuario. 
	 * El método examinará el número introducido por el usuario y, si dicho número no está entre el valor 
	 * mínimo y el máximo que se ha indicado, seguirá pidiendo números al usuario hasta 
	 * que se obtenga uno válido. Finalmente se debe devolver dicho valor del usuario al método main, 
	 * que lo imprimirá en la consola.
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int minimo, int maximo) {
		int num;
		
		do {
			num = Utils.obtenerEnteroPorScanner();
			if (num < minimo || num > maximo) {
				System.out.println("El numero no esta entre el " + minimo + " y el " + maximo + "Introduce entre 0 y 30");
			}
		}
		while (num < minimo || num > maximo); {
			}
		return num;
		
	}
	/*3º.- Método llamado "maximo" que devuelva el valor máximo de dos números enteros 
	 * recibidos como argumentos de entrada. 
	 * El método main pedirá dos números al usuario y los enviará a este nuevo método.
	 *  Finalmente imprimirá en consola el valor devuelto por el método.
	 * 
	 */
	public static int maximo(int num1, int num2) {
		int maximo;
		System.out.println("Introduce un numero");
		num1 = Utils.obtenerEnteroPorScanner();
		System.out.println("Introduce otro numero");
		num2 = Utils.obtenerEnteroPorScanner();
		if (num1 > num2) {
			maximo = num1;
		}else {
			maximo = num2;
		}
		return maximo;
	}
	/* 	4º.- Método llamado "numeroImparEntreLimites" que devuelva un número entero 
	 *	aleatorio, impar y comprendido entre dos límites recibidos como parámetros de entrada. 
	 *	"main" debe llamar a este método e imprimir el valor devuelto.
	 */
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int numeroImparEntreLimites(int min, int max) {
		int numero;
		do {
			numero = Utils.obtenerNumeroAzar10();
		}
		while (numero % 2 == 0);
		
		return numero;
	}
	/*5º.- Realiza un método que reciba un valor entero, del 1 al 10, 
	 * como argumento de entrada y devuelva un String, con  dicho número escrito en palabras. 
	 * Llama a este método "getStringFromEntero".
	 */
	
	public static int traducenumero(int num) {
	if (num == 1) {
		System.out.println("Uno");
	}
	if (num == 2) {
		System.out.println("Dos");
	}
	if (num == 3) {
		System.out.println("Tres");
}
	if (num == 4) {
		System.out.println("Cuatro");
}
	if (num == 5) {
		System.out.println("Cinco");
}
	if (num == 6) {
		System.out.println("Seis");
}
	if (num == 7) {
		System.out.println("Siete");
}
	if (num == 8) {
		System.out.println("Ocho");
}
	if (num == 9) {
		System.out.println("Nueve");
}
	if (num == 10) {
		System.out.println("Diez");
}
	return num;
}



	/*
	 * 7º.- La serie de Fibonacci es una serie numérica que comienza en los números 1, 1 y
	 *  continua de forma infinita, calculando cada mienbro de la serie como la suma de los dos anteriores.
	 *   De esta manera, la serie de Fibonacci comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... 
	 *   Debes realizar un método llamado "fibonacci". Recibirá un argumento de entrada, de tipo entero. 
	 *   El método debe devolver un array con la serie de Fibonacci. El parámetro de entrada del método determinará 
	 *   la longitud del array a devolver. El método main recibirá el array y lo imprimirá en la consola.
	 */
	
	public static int[] fibonacci (int longitud) {
		int fibo[] = new int[longitud];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i -1] + fibo[i + 2];
			
		}return fibo;
		
	}
	/*8º.- Método que imprima en pantalla un array, recibirá un array como parámetro de entrada 
	 * y lo mostrará en consola. Main debe enviar el array al método, llamado "imprimeArray".
	 */
	public static void imprimeArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			
		}
	}
	/**
	 * 10º.- Método que muestre en pantalla los números del 1 al 100. El único requisito para esto es que debe
	 *  hacerse utilizando la recursividad.
	 */
	
	public static int factorial (int num) {
		if (num == 100) {
			return num;
		}else {
			System.out.println(num);
			return factorial(num +1);
		}
		
	}
}