package examenFebrero.Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Propiedades {

	private static Properties propiedades = null;

	public Propiedades() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();

			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/examenFebrero/Ejercicio4/propiedades.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return propiedades;
	}

	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty(String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty(String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}

	public static Boolean getBooleanProperty(String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}

	public static void main(String[] args) {
		String usuario = Propiedades.getProperty("USUARIO");
		int edad = Propiedades.getIntProperty("EDAD");
		Float nota = Propiedades.getFloatProperty("NOTA");
		Boolean listo = Propiedades.getBooleanProperty("LISTO");

		System.out.println("Usuario leído del fichero de propiedades: " + usuario);
		System.out.println("Edad leído del fichero de propiedades: " + edad);
		System.out.println("Nota leído del fichero de propiedades: " + nota);
		System.out.println("Listo leído del fichero de propiedades: " + listo);
		
		// Fecha
		String fecha = Propiedades.getProperty("FECHA");
		System.out.println("Fecha leído del fichero de propiedades " + fecha);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
		System.out.println("Fecha actual: " + sdf.format(new Date()));
		
		Date fechaFormateada = null;
		try {
			fechaFormateada = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
			System.out.println(fechaFormateada);
		} catch (ParseException e) {
			System.out.println(
					"No se ha podido formatear la fecha, por favor introduce una fecha Válida " + e.getMessage());
		}

		Calendar fechaCalendar = Calendar.getInstance();

		// Año
		System.out.println("Año en tipo Calendar " + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Año en tipo Date " + new SimpleDateFormat("yyyy").format("FECHA"));

		// Mes
		System.out.println("Mes en tipo Calendar " + fechaCalendar.get(Calendar.MONTH));
		System.out.println("Mes en tipo Date " + new SimpleDateFormat("MM").format("FECHA"));

		// Dia
		System.out.println("Dia en tipo Calendar " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia en tipo Date " + new SimpleDateFormat("dd").format("FECHA"));

		// Hora
		System.out.println("Hora en tipo Calendar " + fechaCalendar.get(Calendar.HOUR));
		System.out.println("Hora en tipo Date " + new SimpleDateFormat("HH").format("FECHA"));

		// Minutos
		System.out.println("Minutos en tipo Calendar " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Minutos en tipo Date " + new SimpleDateFormat("mm").format("FECHA"));

		// Segundos
		System.out.println("Segundos en tipo Calendar " + fechaCalendar.get(Calendar.SECOND));
		System.out.println("Segundos en tipo Date " + new SimpleDateFormat("ss").format("FECHA"));

	}

}
