package practicasNavidad.Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int menu = Integer.parseInt(JOptionPane.showInputDialog("1. C�lculo de la hipotenusa de un tri�ngulo.\r\n"
								+ "2. C�lculo de la superficie de una circunferencia.\r\n"
								+ "3. C�lculo del per�metro de una circunferencia.\r\n"
								+ "4. C�lculo del �rea de un rect�ngulo.\r\n"
								+ "5. C�lculo del �rea de un tri�ngulo.\r\n"
								+ "0. Salir de la aplicaci�n."));

		switch (menu) {
		case 0:
			
		break;
		case 1:
			int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer cateto"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo cateto"));
			System.out.println("La hipotenusa es " + Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2))));
			break;
		case 2:
			double pi = 3.14;
			double radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del radio"));
			double area = pi * Math.pow(radio, 2);
			System.out.println("La superficie del circulo mide " + area + "cm");
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("Numero no reconocido, por favor, introduzca alguno de los numeros indicados");
		
		}
	}

}
