package examenes.examenFebrero.Ejercicio2;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Baloncesto {
	static HashMap<Integer, CromoBaloncesto> hm = new HashMap<Integer, CromoBaloncesto>();
	static Integer id;
	static String nombre;
	static Integer puntosPasados, rebotesPasados;
	
	public static void main(String[] args) {
		hm.put(7, new CromoBaloncesto(1, "Juan", 20, 40));
		hm.put(8, new CromoBaloncesto(2, "Pablo", 30, 50));
		hm.put(9, new CromoBaloncesto(3, "Antonio", 40, 60));

		
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("adios");
				System.exit(0);
			case 1:
				visualizarValores();
				break;
			case 2:
				anadirCromo();
				break;
			case 3:
				borrarCromoID();
				break;
			case 4:
				MuestraJugadorMasPuntos();
				break;
			}
		} while (opcion != 0);
	}
	
	public static int menu() {
		String strMenu = "\n\nMenu" + "\n0.- Salir" + "\n1.- Visualizar Valores" + "\n2.- Añadir Cromo"
				+ "\n3.- Eliminar Cromo especifico" + "\n4.- Muestra Jugador con mas puntos";
		// Muestro el menu y pido una opcion al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opcion seleccionada
		return opcionUsuario;
	}
	
	public static void visualizarValores() {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(" Key: " + claves[i].toString()
					+ " - Objeto obtenido: " + hm.get(claves[i]));
		}

	}
	
	public static void anadirCromo() {
		id = Integer.parseInt(JOptionPane.showInputDialog("Introduce id"));
		nombre = JOptionPane.showInputDialog("Inserta el nombre del jugador");
		puntosPasados = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de puntos que tuvo en la temporada pasada"));
		rebotesPasados = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de rebotes que tuvo en la temporada pasada"));

		hm.put(id, new CromoBaloncesto(id, nombre, puntosPasados, rebotesPasados));

	}
	
	public static void borrarCromoID() {
		id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del cromo que desea eliminar"));
		hm.remove(id);
	}
	
	public static void MuestraJugadorMasPuntos() {
//		if (hm.keySet()) {
//			
//		}
	}
	
	
	

}
