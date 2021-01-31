package capitulo06_Recursos.Math;

import javax.swing.JOptionPane;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {

		int a, b, c;
		double formula1, formula2;
		String str;

		str = JOptionPane.showInputDialog("Introduce el par�metro A:");
		a = Integer.parseInt(str); // 1

		str = JOptionPane.showInputDialog("Introduce el par�metro B:");
		b = Integer.parseInt(str); // 3

		str = JOptionPane.showInputDialog("Introduce el par�metro C:");
		c = Integer.parseInt(str); // 2

		double raiz;
		double denominador;

		denominador = 2 * a;

		raiz = Math.sqrt((Math.pow(b, 2)) - 4 * a * c);

		formula1 = (-b + raiz) / denominador;
		formula2 = (-b - raiz) / denominador;

		System.out.println("El resultado es: " + formula1 + " y por el negativo: " + formula2);
	}

}
