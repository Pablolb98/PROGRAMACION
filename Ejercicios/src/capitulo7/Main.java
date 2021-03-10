package capitulo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Main {

//	static HashMap<Integer, Fabricante> hm = new HashMap<Integer, Fabricante>();
//
//	static int id, cif;
//	static String nombre;

	public static void main(String[] args) {

		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				pruebaConsultaBasica();
				break;
			case 2:
				AñadirFab();
				break;
			case 3:
				EliminarFab();
				break;
			case 4:
				EditarFab();
				break;
			}
		} while (opcion != 0);
	}

	public static int menu() {
		String strMenu = "\n\nMenu" + "\n0.- Salir" + "\n1.- Listado" + "\n2.- Crear Fabricante"
				+ "\n3.- Eliminar Fabricante" + "\n4.- Editar Fabricante";
		// Muestro el menu y pido una opcion al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opcion seleccionada
		return opcionUsuario;
	}

	private static void pruebaConsultaBasica() {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			ResultSet rs = s.executeQuery("select * from fabricante");

			// Navegaci�n del objeto ResultSet
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3) + " ");
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	private static void AñadirFab() {
		
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Por favor, Introduce un id"));
		String cif = JOptionPane.showInputDialog("Por favor, Introduce un Cif");
		String nombre = JOptionPane.showInputDialog("Introduce la marca del coche");
		
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			int regAfec = s.executeUpdate("insert into fabricante values ('" + id + "' + '" + cif + "' + '" + nombre + "')");


			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void EliminarFab() {
		
		String nombre = JOptionPane.showInputDialog("Por favor, Introduce el nombre del Fabricante que desea eliminar");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			Statement s = (Statement) conexion.createStatement();

			
			int regAfec = s.executeUpdate("delete * from fabricante where nombre = '" + nombre + "'");


			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void EditarFab() {
		String nombre = JOptionPane.showInputDialog("Por favor, Introduce el nombre del Fabricante que desea modificar");
		String newNombre = JOptionPane.showInputDialog("Introduzca el NUEVO Nombre");
		String cif = JOptionPane.showInputDialog("Introduzca el NUEVO Cif");
		
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			int regAfec = s.executeUpdate("update fabricante set cif = '" + cif + "' nombre= '" + newNombre + "' where nombre= '" + nombre + "'" );


			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
