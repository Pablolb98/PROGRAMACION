package capitulo6.Excepciones.Ejercicio1;

import javax.swing.JOptionPane;


public class PeticionNumeros {

	static String str = JOptionPane.showInputDialog("introduce un numero Par");
	static int numPar = Integer.parseInt(str);
	
	
	public static void main(String[] args) {
		
			pideNumeroPar();
		
	}
	
	public static void pideNumeroPar() {
		
		try {
			if (numPar % 2 == 0) {
				System.out.println("El " + numPar + " es un numero PAR");

			}else {
			    System.out.println("El " + numPar + "  es impar");
			    throw new Excepcion ("El " + numPar + " es impar");
			}
		}catch (Excepcion e) {
			System.out.println(e);
			
		}
		
	}	

}
