package capitulo5.bloque4;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {

	public static int obtenerNumeroAzar10() {
		return (int) Math.round(Math.random() * 10);

	}
	public static int obtenerNumeroAzarSinLimites() {
		return (int) Math.round(Math.random());

	}
	
	public static int obtenerNumeroAzar50() {
		return (int) Math.round(Math.random() * 50);

	}

	public static int obtenerNumeroAzar100() {
		return (int) Math.round(Math.random() * 100 + 1);

	}
	
	public static int obtenerNumeroAzar1000() {
		return (int) Math.round(Math.random() * 1000);

	}
	
	public static int numAleatorioLimSupInf(int limiteInf, int limiteSup) {
		return (int) Math.round(Math.random() * (limiteSup - limiteInf) + limiteInf);
	}
	
	public static void mostrarArrayInt (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un numero");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	public static int obtenerEntero() {
		return obtenerEnteroPorJOptionPane();
	}
}
