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
	 * 1�.- M�todo que reciba como par�metros de entrada tres valores enteros y uno flotante. 
	 * El m�todo se llamar� "media" y debe devolver la media aritm�tica de los cuatro valores. 
	 * El valor devuelto debe ser flotante. El m�todo "main" debe llamar a este otro m�todo, 
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
	
	 /** 2�.- M�todo llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros: 
	 * un valor m�nimo y un valor m�ximo. El m�todo debe pedir un numero al usuario. 
	 * El m�todo examinar� el n�mero introducido por el usuario y, si dicho n�mero no est� entre el valor 
	 * m�nimo y el m�ximo que se ha indicado, seguir� pidiendo n�meros al usuario hasta 
	 * que se obtenga uno v�lido. Finalmente se debe devolver dicho valor del usuario al m�todo main, 
	 * que lo imprimir� en la consola.
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
	/*3�.- M�todo llamado "maximo" que devuelva el valor m�ximo de dos n�meros enteros 
	 * recibidos como argumentos de entrada. 
	 * El m�todo main pedir� dos n�meros al usuario y los enviar� a este nuevo m�todo.
	 *  Finalmente imprimir� en consola el valor devuelto por el m�todo.
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
	/* 	4�.- M�todo llamado "numeroImparEntreLimites" que devuelva un n�mero entero 
	 *	aleatorio, impar y comprendido entre dos l�mites recibidos como par�metros de entrada. 
	 *	"main" debe llamar a este m�todo e imprimir el valor devuelto.
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
	/*5�.- Realiza un m�todo que reciba un valor entero, del 1 al 10, 
	 * como argumento de entrada y devuelva un String, con  dicho n�mero escrito en palabras. 
	 * Llama a este m�todo "getStringFromEntero".
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
	 * 7�.- La serie de Fibonacci es una serie num�rica que comienza en los n�meros 1, 1 y
	 *  continua de forma infinita, calculando cada mienbro de la serie como la suma de los dos anteriores.
	 *   De esta manera, la serie de Fibonacci comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... 
	 *   Debes realizar un m�todo llamado "fibonacci". Recibir� un argumento de entrada, de tipo entero. 
	 *   El m�todo debe devolver un array con la serie de Fibonacci. El par�metro de entrada del m�todo determinar� 
	 *   la longitud del array a devolver. El m�todo main recibir� el array y lo imprimir� en la consola.
	 */
	
	public static int[] fibonacci (int longitud) {
		int fibo[] = new int[longitud];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i -1] + fibo[i + 2];
			
		}return fibo;
		
	}
	/*8�.- M�todo que imprima en pantalla un array, recibir� un array como par�metro de entrada 
	 * y lo mostrar� en consola. Main debe enviar el array al m�todo, llamado "imprimeArray".
	 */
	public static void imprimeArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			
		}
	}
	/**
	 * 10�.- M�todo que muestre en pantalla los n�meros del 1 al 100. El �nico requisito para esto es que debe
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