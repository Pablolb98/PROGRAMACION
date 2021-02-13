package capitulo6.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
	String str = JOptionPane.showInputDialog("Introduce una fecha (dd/MM/yyyy)");
		
		Date fechaFormateada = null;
		
		
		try {
			fechaFormateada = new SimpleDateFormat("DD/MM/YYYY").parse(str);
			System.out.println(fechaFormateada);
		}
		catch(ParseException e){
			System.out.println("No se ha podido formatear la fecha, por favor introduce una fecha Válida " + e.getMessage());
		}
		
		System.out.println("Fecha introducida --> " + str);
		System.out.println("Fecha Formateada --> " + fechaFormateada);
		
		System.out.println(""
				+ "----------------------------------------------------------------------------------------------------------");
		
		
		
		Calendar fechaCalendar = Calendar.getInstance();
		
		
		//Año
		System.out.println("Año en tipo Calendar " + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Año en tipo Date " + new SimpleDateFormat("yyyy").format(fechaFormateada));
		
		//Mes
		System.out.println("Mes en tipo Calendar " + fechaCalendar.get(Calendar.MONTH));
		System.out.println("Mes en tipo Date " + new SimpleDateFormat("MM").format(fechaFormateada));
		
		//Dia
		System.out.println("Dia en tipo Calendar " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia en tipo Date " + new SimpleDateFormat("dd").format(fechaFormateada));
		
		//Hora
		System.out.println("Hora en tipo Calendar " + fechaCalendar.get(Calendar.HOUR));
		System.out.println("Hora en tipo Date " + new SimpleDateFormat("HH").format(fechaFormateada));
		
		//Minutos
		System.out.println("Minutos en tipo Calendar " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Minutos en tipo Date " + new SimpleDateFormat("mm").format(fechaFormateada));
		
		//Segundos
		System.out.println("Segundos en tipo Calendar " + fechaCalendar.get(Calendar.SECOND));
		System.out.println("Segundos en tipo Date " + new SimpleDateFormat("ss").format(fechaFormateada));
		
		System.out.println(""
				+ "----------------------------------------------------------------------------------------------------------");

		
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Suma 3 dias " + fechaCalendar);
		fechaCalendar.add(Calendar.MONTH, -2);
		System.out.println("Resta 2 meses " + fechaCalendar);
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Suma 300 dias " + fechaCalendar);
		fechaCalendar.add(Calendar.YEAR, 4);
		System.out.println("Suma 4 años " + fechaCalendar);
	}

}
