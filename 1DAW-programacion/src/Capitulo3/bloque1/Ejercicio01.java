package Capitulo3.bloque1;


import javax.swing.JOptionPane;

public class Ejercicio01 {

		public static void main(String[] args) {
	
	        int num, suma = 0;
	  
	        for (int i = 0; i < 4; i++) {
	            String str = JOptionPane.showInputDialog("Introduce un N�mero: ");
	            num = Integer.parseInt(str);
	            if (num >= 10) {
	                suma += num; 
	            }
	            System.out.println(
	                    "N� Introducido: " + num + ". El resultado de la suma de los n�meros mayores a 10 es: " + suma);
	        }

	}
} 


