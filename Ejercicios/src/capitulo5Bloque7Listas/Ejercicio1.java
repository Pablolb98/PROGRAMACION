package capitulo5Bloque7Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * 1.- Escribe un programa editor de textos. Debes utilizar la consola de Java.
		 * El objetivo es que se pueda editar el contenido de un archivo ficticio. Para
		 * hacer esto utilizar�s una lista de elementos de tipo String. Cada l�nea del
		 * texto ser� representada como un String. Debes mostrar un men� en pantalla,
		 * que contenga todas las opciones siguientes, y que funcionen adecuadamente:
		 *a) "Abandonar el programa". 
	     *b) "Agregar una l�nea al texto". Pediras al usuario un String y lo agregar�s al final de la lista que representa tu fichero ficticio.
	     *b) "Insertar una l�nea en cualquier posici�n del texto". Pedir�s al usuario un String y un n�mero. Insertar�s el String en la l�nea pedida.
	     *c) "Editar una l�nea (reescribir su contenido)". Pedir�s al usuario un n�mero de l�nea para sobrescribir, mostrar�s al usuario la l�nea actual que desea sobrescribir. Pedir�s un nuevo String. Eliminar�s el String actual y cambiar�s con el nuevo
	     *d) "Borrar una l�nea". Pedir�s un n�mero de l�nea y la eliminar�s de la lista.
	     *e) "Cortar un conjunto de l�neas", (marcadas por su posici�n inicial y final). Pedir�s un n�mero de l�nea inicial y uno final. "Transportar�s todas las l�neas del intervalo a una nueva lista y las borrar�s de la lista original.
	     *f) "Pegar un conjunto de l�neas cortadas en una determinada posici�n". Pedir�s un n�mero de l�nea en la que insertar lo que tienes cortado con la opci�n anterior.
	     *g) "Imprimir el fichero". Mostrar�s cada l�nea del fichero ficticio, aparecer� numerada en la consola.
		 */

		int opcion;
		List<String> fichero = new ArrayList<String>();
		List <String> portapapeles = new ArrayList<String>();
		List <String> fichero2 = new ArrayList<String>();
		
		fichero.add("Primera linea");
		fichero.add("Segunda linea");
		fichero.add("Tercera linea");
		fichero.add("cuarta linea");
		fichero.add("quinta linea");
		fichero.add("sexta linea");

		do {
			opcion = menu();

			switch (opcion) {
			case 0:
				System.out.println("adios");
				break;
			case 1:
				AgregarLineaTexto(fichero);
				break;
			case 2:
				InsertarLinea(fichero);
				break;
			case 3:
				editarLinea(fichero);
				break;
			case 4:
				borrarLinea(fichero);
				break;
			case 5:
				cortarLinea(fichero, portapapeles);
				break;
			case 6:
				pegarLinea(fichero2, portapapeles);
				break;
			case 7: 
				imprimirLista(fichero);
				break;
			case 8: 
				imprimirLista2(fichero2);
				break;
			default:
				System.out.println("Opcion no valida");
			}

		} while (opcion != 0);

	}

	public static int menu() {
		String strmenu = "\nMenu" 
				+ "\n0- Abandonar programa" 
				+ "\n1- Agregar Linea de texto"
				+ "\n2- Insertar una l�nea en cualquier posici�n del texto"
				+ "\n3- Editar una l�nea (reescribir su contenido)" 
				+ "\n4- Borrar una l�nea"
				+ "\n5- Cortar un conjunto de l�neas"
				+ "\n6- Pegar un conjunto de l�neas cortadas en una determinada posici�n" 
				+ "\n7- Imprimir el fichero"
				+ "\n8- Imprimir el fichero2";
		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));
		return opcionMenu;
	}
	
	public static void AgregarLineaTexto(List<String>lista) {
		String str = JOptionPane.showInputDialog("Introduce un texto");
		lista.add(str);
	}
	
	public static void InsertarLinea(List<String>lista) {
		int linea = Integer.parseInt(JOptionPane.showInputDialog("En que linea desea insertar el texto?"));
		String texto = JOptionPane.showInputDialog("Introduce el texto");	
		lista.add(linea, texto);
	}
	
	public static void editarLinea(List<String>lista) {
		int linea = Integer.parseInt(JOptionPane.showInputDialog("Que linea desea editar?"));
		lista.remove(linea);
		String texto = JOptionPane.showInputDialog("Escribe el nuevo contenido");
		lista.add(linea, texto);
	}
	
	public static void borrarLinea(List<String>lista) {
		int linea = Integer.parseInt(JOptionPane.showInputDialog("Que linea desea eliminar?"));
		lista.remove(linea);
	}
	
	public static void cortarLinea(List<String>lista, List<String>portapapeles) {
		int lineaIni = Integer.parseInt(JOptionPane.showInputDialog(" Que linea desea cortar? (entre 0 y 10) "));
		int lineaFin = Integer.parseInt(JOptionPane.showInputDialog(" Hasta que linea desea cortar? (entre 0 y 10) "));
		for (int i = lineaIni; i <= lineaFin; i++) {
			portapapeles.add(lista.get(i));
			lista.remove(i);
		}
	}
	
	public static void pegarLinea(List<String>lista, List<String>lista2) {
		int linea = Integer.parseInt(JOptionPane.showInputDialog("A partir de que linea desea pegar las lineas cortadas anteriormente?"));//Elegir el 0 porque el fichero2 est� vac�o. 
			lista.addAll(linea, lista2);
		
		

	}
	public static void imprimirLista (List<String> lista) {
		System.out.println("Contenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	public static void imprimirLista2 (List<String> lista) {
		System.out.println("Contenido del fichero2");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
}
