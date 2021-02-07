package hashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio {
	static HashMap<Integer, Articulo> hm = new HashMap<Integer, Articulo>();

	static String key, nombre;
	static int codBarras, numEstante, unidadesStock;

	public static void main(String[] args) {
		hm.put(2563252, new Articulo("LimpiaCristal", 5, 10));
		hm.put(7654524, new Articulo("Agua", 4, 50));
		hm.put(4987532, new Articulo("Larios", 3, 2));

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
				actualizarNombre();
				break;
			case 4:
				actualizarStock();
				break;
			case 5:
				actualizarEstanteria();
				break;
			case 6:
				buscarPorCodigo();
				
				break;
			case 7:
				mostrarArticulos();
				break;
			}
		} while (opcion != 0);

	}

	public static int menu() {
		String strMenu = "\n\nMenu" + "\n0.- Salir" + "\n1.- Añadir nuevos Articulos" + "\n2.- Borrar un articulo"
				+ "\n3.- Actualizar nombre del articulo" + "\n4.- Actualizar Stock del articulo"
				+ "\n5.- Actualizar Estanteria" + "\n6.- Buscar por codigo" + "\n7.- Mostrar Articulos"
				+ "\n\nIntroduzca su opcion: ";
		// Muestro el menu y pido una opcion al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opcion seleccionada
		return opcionUsuario;
	}

	public static void añadirArticulos() {
		key = JOptionPane.showInputDialog("Inserta el ID del articulo que desea agregar");
		nombre = JOptionPane.showInputDialog("Inserta el nombre del producto que desea agregar");
		codBarras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de Barras"));
		numEstante = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del estante donde va colocado el producto"));
		unidadesStock = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos productos de este tipo quedan en stock"));

		hm.put(codBarras, new Articulo(nombre, numEstante, unidadesStock));

	}

	public static void borrarArticulos() {
		String eliminar = JOptionPane.showInputDialog("Que producto deseas eliminar?");
		hm.remove(eliminar);
	}

	public static void mostrarArticulos() {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("- CodigoBarras: " + claves[i].toString()
					+ " - Objeto obtenido: " + hm.get(claves[i]));
		}

	}

	public static void actualizarNombre() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del artículo que desea cambiar: "));

		System.out.println(hm.get(id));

		String nomNuevo = JOptionPane.showInputDialog("Introduce un nombre nuevo: ");

		hm.get(id).setNombre(nomNuevo);
	}

	public static void actualizarStock() {
		String str;

		str = JOptionPane.showInputDialog("Introduce el id del artículo que quiere cambiar: ");
		int id = Integer.parseInt(str);
		System.out.println(hm.get(id));

		str = JOptionPane.showInputDialog("Introduce una cantidad de stock nueva: ");
		int stockNuevo = Integer.parseInt(str);

		hm.get(id).setUnidadesStock(stockNuevo);
	}

	public static void actualizarEstanteria() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del artículo que desea cambiar: "));
		System.out.println(hm.get(id));

		int numEs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de estantería nuevo: "));

		hm.get(id).setNumEstante(numEs);
	}

	public static void buscarPorCodigo() {
		 String str;
	        str = JOptionPane.showInputDialog("Introduce el codigo de barras del artículo que quieres encontrar: ");
	        int codigo = Integer.parseInt(str);
	        System.out.println(hm.get(codigo));
	}
}
