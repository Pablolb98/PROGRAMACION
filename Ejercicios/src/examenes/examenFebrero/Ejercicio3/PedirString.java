package examenes.examenFebrero.Ejercicio3;

import javax.swing.JOptionPane;

public class PedirString {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduce un String");

		char cadenaTexto[];
		cadenaTexto = str.toCharArray();

		int contadorDigitos=0;
		int contadorminus=0;
		int contadormayus=0;
		int contadorletras=0;

		for (int i = 0; i < cadenaTexto.length; i++) {
			System.out.println(cadenaTexto[i] + " es digito " + Character.isDigit(cadenaTexto[i]));
			System.out.println(cadenaTexto[i] + "' es minúscula: " + Character.isLowerCase(cadenaTexto[i]));
			System.out.println(cadenaTexto[i] + "' es mayúscula: " + Character.isUpperCase(cadenaTexto[i]));
			System.out.println(cadenaTexto[i] + "' es letra: " + Character.isLetter(cadenaTexto[i]));
			
			if (Character.isDigit(cadenaTexto[i]) == true) {
				contadorDigitos++;
			}
			if (Character.isLowerCase(cadenaTexto[i]) == true) {
				contadorminus++;
			}
			if (Character.isUpperCase(cadenaTexto[i]) == true) {
				contadormayus++;
			}
			if (Character.isLetter(cadenaTexto[i]) == true) {
				contadorletras++;
			}
			
			System.out.println("Hay " + contadorDigitos + " digitos");
			System.out.println("Hay " + contadorminus + " minusculas");
			System.out.println("Hay " + contadormayus + " mayusculas");
			System.out.println("Hay " + contadorletras + " letras");
		}
		

//
//		boolean esdigito = false;
//		int contadorDigitos = 0;
//		char cadenaTexto2[] = new char[] { 'H', 'o', 'l', 'a', ' ', 'A', 'm', 'i', 'g', 'o', ' ', '2', '5', '5', '\n' };
//		System.out.println("\nAnalizará el array de caracteres: " + cadenaTexto2.toString());
//		for (int i = 0; i < cadenaTexto2.length; i++) {
//			System.out.println("'" + cadenaTexto2[i] + "' es dígito: " + Character.isDigit(cadenaTexto2[i]));
//		
//			
//			System.out.println("'" + cadenaTexto2[i] + "' es letra: " + Character.isLetter(cadenaTexto2[i]));
//			System.out.println("'" + cadenaTexto2[i] + "' es letra o dígito: " + Character.isLetterOrDigit(cadenaTexto2[i]));
//			System.out.println("'" + cadenaTexto2[i] + "' es minúscula: " + Character.isLowerCase(cadenaTexto2[i]));
//			System.out.println("'" + cadenaTexto2[i] + "' es mayúscula: " + Character.isUpperCase(cadenaTexto2[i]));
//			System.out.println("'" + cadenaTexto2[i] + "' es un caracter similar a espacio en blanco: " + Character.isWhitespace(cadenaTexto2[i]));
//		}
//		
//		if (esdigito == true) {
//			contadorDigitos++;
//			System.out.println("sdsadasdsad" + contadorDigitos);
//		}
//	}
	}
}
