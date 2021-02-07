package capitulo5Bloque7Listas�tulo5Bloque7Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 * 2.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes
		 * mostrar un men� en pantalla y ofrecer al usuario las siguientes opciones a
		 * realizar sobre la lista: a) "Abandonar el programa". b) "Crear aleatoriamente
		 * la lista de valores". Pedir�s al usuario los siguientes datos: longitud de la
		 * lista, valor m�nimo y valor m�ximo. A continuaci�n limpiar�s la lista (por si
		 * conten�a valores), y agregar�s tantos elementos enteros como se haya
		 * indicado, con valores que deben oscilar entre el m�nimo y el m�ximo se�alado.
		 * c) "Calcular suma, media, mayor y menor". Mostrar�s en pantalla esos cuatro
		 * valores. d) "Agregar una cantidad de nuevos valores". Pedir�s al usuario los
		 * siguientes datos: cu�ntos datos nuevos quiere agregar, posici�n a partir de
		 * la que se deben introducir, valor m�nimo y valor m�ximo. Incluir�s tantos
		 * valores como indique el usuario, en la posici�n indicada, con valores entre
		 * m�nimo y m�ximo. e) "Eliminar elementos cuyo valor est� en un intervalo".
		 * Pedir�s dos valores al usuario (m�nimo y m�ximo), que conforman un intervalo.
		 * Eliminar�s los valores de la lista de elementos que se encuentren dentro de
		 * ese intervalo (incluyendo los l�mites) e informar�s de cuantos elementos has
		 * eliminado de la lista. f) "Imprimir la lista". Mostrar�s la lista en
		 * pantalla.
		 */
		// Declaro variables necesarias
		int opcion;
		List<Integer> lista = new ArrayList<Integer>();

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa esta finalizado
		lista.add(3);
		lista.add(4);
		lista.add(2);
		lista.add(4);
		lista.add(9);
		lista.add(5);
		lista.add(7);
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(10);

		// Bucle principal de la aplicacion
		do {
			// Llamo a mostrar el menu y pedir una opcion al usuario.
			opcion = menu();

			// Cada caso en funcion de la opcion elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicacion
				System.out.println("Adios!");
				break;
			case 1:
				listaValoresAleatorios(lista);
				break;
			case 2:
				CalcularSumaMediaMayoryMenor(lista);
				break;
			case 3:
				agregarValores(lista);
				break;
			case 4:
				eliminarElementos(lista);
				break;
			case 5:
				imprimirLista(lista);
				break;
			default:
				System.out.println("Opcion no valida");
			}

		} while (opcion != 0);

	}

	public static int menu() {
		String strMenu = "\n\nMenu (Por favor Introduce primero el numero 5 para ver la los valores de la lista)" 
				+ "\n0.- Salir" 
				+ "\n1.- Lista de Valores aleatorios (longitud, valorMin y Max)"
				+ "\n2.- Calcular suma y media" 
				+ "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor est� en un intervalo" 
				+ "\n5.- Imprimir la lista";
		// Muestro el menu y Pido una opcion al usuario
		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opcion seleccionada
		return opcionMenu;

	}

	public static void listaValoresAleatorios(List<Integer> lista) {
		int min = Integer.parseInt(JOptionPane.showInputDialog("De cuantos numeros quieres la lista?" + "\nIntroduce el primer valor"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor"));
		for (int i = min; i <= max; i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
			lista.add(i);
			if (min <= lista.get(i)) {
				System.out.println("El valor minimo es " + min);
			}
			if (max >= lista.get(i)) {
				System.out.println("El valor minimo es " + max);
			}
			
		}

	}

	public static void CalcularSumaMediaMayoryMenor(List<Integer>lista) {
		int suma = 0;
		int media = 0;
		int menor = 0, mayor = 0;
		boolean primeravez = true;
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (primeravez == true) {
				mayor = lista.get(i);
				menor = lista.get(i);
				primeravez = false;
			}
			
			if (lista.get(i) < menor) {
				menor = lista.get(i);
			}
			
			if (lista.get(i) > mayor) {
				mayor = lista.get(i);
			}
			
			
			suma += lista.get(i); //Se suma 0 (valor de "Suma") + lista.get(i) (valores de la lista).
		}
		
		System.out.println("El menor es " + menor);
		System.out.println("El mayor es " + mayor);

		media = suma / lista.size(); //Se suman los valores de la lista y se divide entre la longitud
		
		System.out.println("La suma de los numeros de la lista es: " + suma);
		System.out.println("La media de los numeros de la lista es: " + media);
		
	
	}
	public static void agregarValores(List<Integer> lista) {
		int cantNum = Integer.parseInt(JOptionPane.showInputDialog("Cu�ntos datos nuevos quiere agregar"));
		int valorMin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero minimo de la lista"));
		int valorMax = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero maximo de la lista"));
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("A partir de que posicion desea introducir los valores?"));
		
		for (int i = 0; i<lista.size(); i++) {
			if(i == posicion) {
				for (int j = 0; j < cantNum; j++ ) {
					lista.add(i, Utils.numAleatorioLimSupInf(valorMin, valorMax));
				}
				}
			
			}
		
		}
	
	public static void eliminarElementos(List<Integer> lista) {
		
		int longitudMin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero minimo de la lista"));
		int longitudMax = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero maximo de la lista"));
		int longitudTotal = longitudMin + longitudMax;
		for (int i = longitudMin; i<longitudMax; i++) {
			System.out.println("\n" + i + " - " + lista.get(i));
			lista.remove(i);
		}
		System.out.println("Se han eliminado " + longitudTotal + " valores ");
	}
	
	public static void imprimirLista (List<Integer> lista) {
		System.out.println("Contenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
}
