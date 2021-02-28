package capitulo6.Excepciones.Ejercicio2;

import javax.swing.JOptionPane;

public class PedirFrase {

	public static void main(String[] args) {
	try {
		System.out.println(PedirFrase());
	} catch (TresPalabras e) {
		e.printStackTrace();
	} catch (Bombilla e) {
		e.printStackTrace();
	} catch (EspacioEnBlanco e) {
		e.printStackTrace();
	} catch (Insulto e) {
		e.printStackTrace();
	}

}

private static String PedirFrase() throws TresPalabras, Bombilla, EspacioEnBlanco, Insulto {
	String str = JOptionPane.showInputDialog(
			"Introduce una frase con la palabra bombilla, con 3 palabras y con una palabra ofensiva");

	String[] palabras = str.split(" ");
	for (int i = 0; i < palabras.length; i++) {
		
	}
	if (palabras.length < 3) {
		throw new TresPalabras("Hay menos de 3 palabras");
	}

	if (str.indexOf("bombilla") == -1) {
		throw new Bombilla("No está la palabra bombilla");
	}

	if (str.trim().equals("")) {
		throw new EspacioEnBlanco("No hay espacios en blanco");
	}
	if (str.indexOf("tonto") == 0 || str.indexOf("tonta") == 0 || str.indexOf("idiota") == 0) {
		throw new Insulto("Hay palabras ofensivas");
	}

	return str;
}
}
