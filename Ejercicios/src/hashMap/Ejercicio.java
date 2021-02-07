package hashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio {
	static HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
	
	static String key, nombre;
	static int codBarras, numEstante, unidadesStock;
	
	public static void main(String[] args) {
		hm.put("1", new Articulo("LimpiaCristal", 2563252, 5, 10));
		hm.put("2", new Articulo("Agua", 7654524, 4, 50));
		hm.put("3", new Articulo("Larios", 4987532, 3, 2));
		hm.put(new String("4"), new Articulo("Ron", 231254323, 3, 8));

		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				añadirArticulos();
				break;
			case 2:
				borrarArticulos();
				break;
			case 3:
				editarArticuloExistente();
				break;
			case 4:
				mostrarArticulos();
				break;
			case 5:
				break;
			}
		} while (opcion != 0);

	}

	public static int menu() {
		String strMenu = "\n\nMenu" + "\n0.- Salir" + "\n1.- Añadir nuevos Articulos" + "\n2.- Borrar un articulo"
				+ "\n3.- Editar Articulos" + "\n4.- Mostrar Articulos"
				+ "\n6.- Buscar un articulo determinado" + "\n\nIntroduzca su opcion: ";
		// Muestro el menÃº y pido una opciÃ³n al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opciÃ³n seleccionada
		return opcionUsuario;
	}

	public static void añadirArticulos() {
		key = JOptionPane.showInputDialog("Inserta el ID del articulo que desea agregar");
		nombre = JOptionPane.showInputDialog("Inserta el nombre del producto que desea agregar");
		codBarras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de Barras"));
		numEstante = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del estante donde va colocado el producto"));
		unidadesStock = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos productos de este tipo quedan en stock"));

		hm.put(key, new Articulo(nombre, codBarras, numEstante, unidadesStock));

	}

	public static void borrarArticulos() {
		String eliminar = JOptionPane.showInputDialog("Que producto deseas eliminar?");
		hm.remove(eliminar);
	}

	public static void mostrarArticulos() {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass() + " - valor: " + claves[i].toString()
					+ " - Objeto obtenido: " + hm.get(claves[i]));
		}

	}

	public static void editarArticuloExistente() {
		int value = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo estante donde desea poner el producto"));
		System.out.println(hm.get(value));
		
		int nuevoEstante = Integer.parseInt(JOptionPane.showInputDialog("introduce nuevo codigo"));
		hm.get(value).setNumEstante(nuevoEstante);
	}
	
}
