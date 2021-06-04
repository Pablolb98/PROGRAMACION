package capitulo6.WrappersPrimitivos;

import javax.swing.JOptionPane;

public class Ejercicio2CrearPassword {

	public static void main(String[] args) {

		boolean mayus = false;
		boolean minus = false;
		boolean digito = false;
		boolean noAlfanum = false;

		do {

			String str = JOptionPane.showInputDialog("Introduce una contraseña que contenga al menos " + "una mayuscula"
					+ "una minuscula" + "un digito" + "un caracter no alfa numerico (!¡¿?;, etc...)");

			char cadenaTexto[];
			cadenaTexto = str.toCharArray();

			System.out.println("\nAnaliza el array de caracteres: " + cadenaTexto.toString());
			for (int i = 0; i < cadenaTexto.length; i++) {

				if (mayus == false) {
					mayus = Character.isUpperCase(cadenaTexto[i]);
				}

				if (minus == false) {
					minus = Character.isLowerCase(cadenaTexto[i]);
				}

				if (digito == false) {
					digito = Character.isDigit(cadenaTexto[i]);
				}

				if (noAlfanum == false) {
					noAlfanum = Character.isLetterOrDigit(cadenaTexto[i]);
				}
			}

		} while (mayus == false && minus == false && digito == false && noAlfanum == false);

	}

}
