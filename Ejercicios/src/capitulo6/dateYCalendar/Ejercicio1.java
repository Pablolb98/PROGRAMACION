package capitulo6.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {

		String fecha = JOptionPane.showInputDialog("Introduce una fecha: ");
		
		Date fechaFormateada = null;

		try {
			fechaFormateada = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
			System.out.println(fechaFormateada);

		}
		catch (ParseException e) {
			System.out.println("ParseException occured: " + e.getMessage());
		}
		
		System.out.println("Fecha introducida por el usuario: " + fecha);
		System.out.println("Fecha parseada : " + fechaFormateada);
		System.out.println(
				"----------------------------------------------------------------------------------------");
		
		
		Calendar calendar = Calendar.getInstance();
		
		 //Año
        System.out.println("(Calendar)Año: " + calendar.get(Calendar.YEAR));
        System.out.println("(Date)Año: " + new SimpleDateFormat("yyyy").format(fechaFormateada));

        //Mes
        System.out.println("(Calendar)Mes: " + calendar.get(Calendar.MONTH + 1));
        System.out.println("(Date)Mes: " + new SimpleDateFormat("MM").format(fechaFormateada));

        //Dia
        System.out.println("(Calendar)Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("(Date)Dia: " + new SimpleDateFormat("dd").format(fechaFormateada));

        //Hora
        System.out.println("(Calendar)Hora: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("(Date)Hora: " + new SimpleDateFormat("HH").format(fechaFormateada));

        //Minutos
        System.out.println("(Calendar)Minutos: " + calendar.get(Calendar.MINUTE));
        System.out.println("(Date)Minutos: " + new SimpleDateFormat("mm").format(fechaFormateada));

        //Segundos
        System.out.println("(Calendar)Segundos: " + calendar.get(Calendar.SECOND));
        System.out.println("(Date)Año: " + new SimpleDateFormat("ss").format(fechaFormateada));
		System.out.println(
				"----------------------------------------------------------------------------------------");

		
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Suma 3 días : " + calendar.getTime());

		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Resto 2 semanas : " + calendar.getTime());

		calendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Suma 300 dias : " + calendar.getTime());

		calendar.add(Calendar.YEAR, 4);
		System.out.println("Suma 4 años : " + calendar.getTime());
	}

}
